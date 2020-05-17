package typingsSlinky.enigmaJs.enigmaJS

import typingsSlinky.enigmaJs.anon.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMixin extends js.Object {
  /**
    * mixin.extend is an object containing methods to extend the generated API with. These method names cannot already exist or enigma.js will throw an error.
    */
  var extend: js.UndefOr[js.Any] = js.native
  /**
    * mixin.override is an object containing methods that overrides existing API methods.
    * These method names needs to exist already* or engima.js will throw an error.
    * Be careful when overriding, you may break expected behaviors in other mixins or your application.
    * base is a reference to the previous mixin method, can be used to invoke the mixin chain before this mixin method.
    */
  var `override`: js.UndefOr[js.Any] = js.native
  /**
    * QIX Engine types like for example GenericObject, Doc, GenericBookmark, are supported but also custom GenericObject
    * types such as barchart, story and myCustomType.
    * An API will get both their generic type as well as custom type mixins applied.
    */
  var types: js.Array[MixinType] = js.native
  def init(args: Api): Unit = js.native
}

object IMixin {
  @scala.inline
  def apply(init: Api => Unit, types: js.Array[MixinType]): IMixin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMixin]
  }
  @scala.inline
  implicit class IMixinOps[Self <: IMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInit(value: Api => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTypes(value: js.Array[MixinType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withOverride(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(js.undefined)
        ret
    }
  }
  
}

