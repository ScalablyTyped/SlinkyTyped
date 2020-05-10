package typingsSlinky.ionicCliFramework.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.minimist.mod.Opts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HydratedParseArgsOptions extends Opts {
  @JSName("alias")
  var alias_HydratedParseArgsOptions: StringDictionary[js.Array[String]] = js.native
  @JSName("boolean")
  var boolean_HydratedParseArgsOptions: js.Array[String] = js.native
  @JSName("default")
  var default_HydratedParseArgsOptions: StringDictionary[String | Boolean] = js.native
  @JSName("string")
  var string_HydratedParseArgsOptions: js.Array[String] = js.native
}

object HydratedParseArgsOptions {
  @scala.inline
  def apply(
    alias: StringDictionary[js.Array[String]],
    boolean: js.Array[String],
    default: StringDictionary[String | Boolean],
    string: js.Array[String]
  ): HydratedParseArgsOptions = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydratedParseArgsOptions]
  }
  @scala.inline
  implicit class HydratedParseArgsOptionsOps[Self <: HydratedParseArgsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoolean(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: StringDictionary[String | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

