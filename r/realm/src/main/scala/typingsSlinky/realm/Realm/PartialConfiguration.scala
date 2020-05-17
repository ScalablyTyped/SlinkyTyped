package typingsSlinky.realm.Realm

import typingsSlinky.realm.anon.PartialSyncConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * realm configuration used for overriding default configuration values.
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
  */
/* Inlined parent std.Partial<realm.Realm.Configuration> */
@js.native
trait PartialConfiguration extends js.Object {
  var deleteRealmIfMigrationNeeded: js.UndefOr[Boolean] = js.native
  var disableFormatUpgrade: js.UndefOr[Boolean] = js.native
  var encryptionKey: js.UndefOr[
    js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.Int8Array
  ] = js.native
  var fifoFilesFallbackPath: js.UndefOr[String] = js.native
  var inMemory: js.UndefOr[Boolean] = js.native
  var migration: js.UndefOr[MigrationCallback] = js.native
  var path: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var schema: js.UndefOr[js.Array[ObjectClass | ObjectSchema]] = js.native
  var schemaVersion: js.UndefOr[Double] = js.native
  var shouldCompactOnLaunch: js.UndefOr[js.Function2[/* totalBytes */ Double, /* usedBytes */ Double, Boolean]] = js.native
  var sync: js.UndefOr[PartialSyncConfiguration] = js.native
}

object PartialConfiguration {
  @scala.inline
  def apply(): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfiguration]
  }
  @scala.inline
  implicit class PartialConfigurationOps[Self <: PartialConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteRealmIfMigrationNeeded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRealmIfMigrationNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteRealmIfMigrationNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteRealmIfMigrationNeeded")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableFormatUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFormatUpgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableFormatUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableFormatUpgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKeyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKeyInt8Array(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncryptionKey(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withFifoFilesFallbackPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fifoFilesFallbackPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFifoFilesFallbackPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fifoFilesFallbackPath")(js.undefined)
        ret
    }
    @scala.inline
    def withInMemory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMemory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInMemory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inMemory")(js.undefined)
        ret
    }
    @scala.inline
    def withMigration(
      value: (/* oldRealm */ typingsSlinky.realm.Realm, /* newRealm */ typingsSlinky.realm.Realm) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migration")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMigration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migration")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: js.Array[ObjectClass | ObjectSchema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCompactOnLaunch(value: (/* totalBytes */ Double, /* usedBytes */ Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCompactOnLaunch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldCompactOnLaunch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCompactOnLaunch")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: PartialSyncConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
  }
  
}

