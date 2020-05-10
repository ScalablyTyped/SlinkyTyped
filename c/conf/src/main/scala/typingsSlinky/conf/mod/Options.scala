package typingsSlinky.conf.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T] extends js.Object {
  /**
  		Access nested properties by dot notation.
  		@default true
  		@example
  		```
  		const config = new Conf();
  		config.set({
  			foo: {
  				bar: {
  					foobar: '🦄'
  				}
  			}
  		});
  		console.log(config.get('foo.bar.foobar'));
  		//=> '🦄'
  		```
  		Alternatively, you can set this option to `false` so the whole string would be treated as one key.
  		@example
  		```
  		const config = new Conf({accessPropertiesByDotNotation: false});
  		config.set({
  			`foo.bar.foobar`: '🦄'
  		});
  		console.log(config.get('foo.bar.foobar'));
  		//=> '🦄'
  		```
  		*/
  val accessPropertiesByDotNotation: js.UndefOr[Boolean] = js.native
  /**
  		The config is cleared if reading the config file causes a `SyntaxError`. This is a good default, as the config file is not intended to be hand-edited, so it usually means the config is corrupt and there's nothing the user can do about it anyway. However, if you let the user edit the config file directly, mistakes might happen and it could be more useful to throw an error when the config is invalid instead of clearing. Disabling this option will make it throw a `SyntaxError` on invalid config instead of clearing.
  		@default true
  		*/
  val clearInvalidConfig: js.UndefOr[Boolean] = js.native
  /**
  		Name of the config file (without extension).
  		Useful if you need multiple config files for your app or module. For example, different config files between two major versions.
  		@default 'config'
  		*/
  val configName: js.UndefOr[String] = js.native
  /**
  		__You most likely don't need this. Please don't use it unless you really have to.__
  		The only use-case I can think of is having the config located in the app directory or on some external storage. Default: System default user [config directory](https://github.com/sindresorhus/env-paths#pathsconfig).
  		*/
  val cwd: js.UndefOr[String] = js.native
  /**
  		Config used if there are no existing config.
  		**Note:** The values in `defaults` will overwrite the `default` key in the `schema` option.
  		*/
  val defaults: js.UndefOr[T] = js.native
  /**
  		Function to deserialize the config object from a UTF-8 string when reading the config file.
  		You would usually not need this, but it could be useful if you want to use a format other than JSON.
  		@default JSON.parse
  		*/
  val deserialize: js.UndefOr[js.Function1[/* text */ String, T]] = js.native
  /**
  		Note that this is __not intended for security purposes__, since the encryption key would be easily found inside a plain-text Node.js app.
  		Its main use is for obscurity. If a user looks through the config directory and finds the config file, since it's just a JSON file, they may be tempted to modify it. By providing an encryption key, the file will be obfuscated, which should hopefully deter any users from doing so.
  		It also has the added bonus of ensuring the config file's integrity. If the file is changed in any way, the decryption will not work, in which case the store will just reset back to its default state.
  		When specified, the store will be encrypted using the [`aes-256-cbc`](https://en.wikipedia.org/wiki/Block_cipher_mode_of_operation) encryption algorithm.
  		*/
  val encryptionKey: js.UndefOr[String | Buffer | TypedArray | js.typedarray.DataView] = js.native
  /**
  		Extension of the config file.
  		You would usually not need this, but could be useful if you want to interact with a file with a custom file extension that can be associated with your app. These might be simple save/export/preference files that are intended to be shareable or saved outside of the app.
  		@default 'json'
  		*/
  val fileExtension: js.UndefOr[String] = js.native
  /*
  		You can use migrations to perform operations to the store whenever a version is changed.
  		The `migrations` object should consist of a key-value pair of `'version': handler`. The `version` can also be a [semver range](https://github.com/npm/node-semver#ranges).
  		Note: The version the migrations use refers to the __project version__ by default. If you want to change this behavior, specify the `projectVersion` option.
  		@example
  		```
  		import Conf = require('conf');
  		const store = new Conf({
  			migrations: {
  				'0.0.1': store => {
  					store.set('debugPhase', true);
  				},
  				'1.0.0': store => {
  					store.delete('debugPhase');
  					store.set('phase', '1.0.0');
  				},
  				'1.0.2': store => {
  					store.set('phase', '1.0.2');
  				},
  				'>=2.0.0': store => {
  					store.set('phase', '>=2.0.0');
  				}
  			}
  		});
  		```
  		*/
  val migrations: js.UndefOr[StringDictionary[js.Function1[/* store */ Conf[T], Unit]]] = js.native
  /**
  		You only need to specify this if you don't have a package.json file in your project or if it doesn't have a name defined within it.
  		Default: The name field in the `package.json` closest to where `conf` is imported.
  		*/
  val projectName: js.UndefOr[String] = js.native
  /**
  		__You most likely don't need this. Please don't use it unless you really have to.__
  		Suffix appended to `projectName` during config file creation to avoid name conflicts with native apps.
  		You can pass an empty string to remove the suffix.
  		For example, on macOS, the config file will be stored in the `~/Library/Preferences/foo-nodejs` directory, where `foo` is the `projectName`.
  		@default 'nodejs'
  		*/
  val projectSuffix: js.UndefOr[String] = js.native
  /**
  		You only need to specify this if you don't have a package.json file in your project or if it doesn't have a version defined within it.
  		Default: The name field in the `package.json` closest to where `conf` is imported.
  		*/
  val projectVersion: js.UndefOr[String] = js.native
  /**
  		[JSON Schema](https://json-schema.org) to validate your config data.
  		Under the hood, the JSON Schema validator [ajv](https://github.com/epoberezkin/ajv) is used to validate your config. We use [JSON Schema draft-07](http://json-schema.org/latest/json-schema-validation.html) and support all [validation keywords](https://github.com/epoberezkin/ajv/blob/master/KEYWORDS.md) and [formats](https://github.com/epoberezkin/ajv#formats).
  		You should define your schema as an object where each key is the name of your data's property and each value is a JSON schema used to validate that property. See more [here](https://json-schema.org/understanding-json-schema/reference/object.html#properties).
  		@example
  		```
  		import Conf = require('conf');
  		const schema = {
  			foo: {
  				type: 'number',
  				maximum: 100,
  				minimum: 1,
  				default: 50
  			},
  			bar: {
  				type: 'string',
  				format: 'url'
  			}
  		};
  		const config = new Conf({schema});
  		console.log(config.get('foo'));
  		//=> 50
  		config.set('foo', '1');
  		// [Error: Config schema violation: `foo` should be number]
  		```
  		**Note:** The `default` value will be overwritten by the `defaults` option if set.
  		*/
  val schema: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: conf.conf.Schema}
    */ typingsSlinky.conf.confStrings.Options with TopLevel[js.Any]
  ] = js.native
  /**
  		Function to serialize the config object to a UTF-8 string when writing the config file.
  		You would usually not need this, but it could be useful if you want to use a format other than JSON.
  		@default value => JSON.stringify(value, null, '\t')
  		*/
  val serialize: js.UndefOr[js.Function1[/* value */ T, String]] = js.native
  /**
  		Watch for any changes in the config file and call the callback for `onDidChange` if set. This is useful if there are multiple processes changing the same config file.
  		__Currently this option doesn't work on Node.js 8 on macOS.__
  		@default false
  		*/
  val watch: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply[T](): Options[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self[t] <: Options[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAccessPropertiesByDotNotation(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPropertiesByDotNotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPropertiesByDotNotation: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPropertiesByDotNotation")(js.undefined)
        ret
    }
    @scala.inline
    def withClearInvalidConfig(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInvalidConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearInvalidConfig: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInvalidConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configName")(js.undefined)
        ret
    }
    @scala.inline
    def withCwd(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserialize(value: /* text */ String => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDeserialize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKeyFloat64Array(value: js.typedarray.Float64Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyUint8ClampedArray(value: js.typedarray.Uint8ClampedArray): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyDataView(value: js.typedarray.DataView): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyInt8Array(value: js.typedarray.Int8Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyUint16Array(value: js.typedarray.Uint16Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyInt16Array(value: js.typedarray.Int16Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKey(value: String | Buffer | TypedArray | js.typedarray.DataView): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyInt32Array(value: js.typedarray.Int32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyUint32Array(value: js.typedarray.Uint32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyFloat32Array(value: js.typedarray.Float32Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyUint8Array(value: js.typedarray.Uint8Array): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFileExtension(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileExtension: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileExtension")(js.undefined)
        ret
    }
    @scala.inline
    def withMigrations(value: StringDictionary[js.Function1[/* store */ Conf[T], Unit]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMigrations: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrations")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectName")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectSuffix(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectSuffix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectVersion(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectVersion: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: conf.conf.Schema}
      */ typingsSlinky.conf.confStrings.Options with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: /* value */ T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

