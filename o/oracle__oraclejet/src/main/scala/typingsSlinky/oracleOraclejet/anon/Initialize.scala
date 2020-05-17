package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Initialize
  extends /* key */ StringDictionary[js.Any] {
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.native
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var parseSave: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var urlRoot: js.UndefOr[String] = js.native
  var validate: js.UndefOr[
    Null | js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[this.type], Double])
  ] = js.native
}

object Initialize {
  @scala.inline
  def apply(): Initialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialize]
  }
  @scala.inline
  implicit class InitializeOps[Self <: Initialize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialize(value: (/* models */ js.Array[Model], /* options */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withParseSave(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseSave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseSave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseSave")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateFunction2(value: (/* attributes */ js.Object, /* options */ js.UndefOr[Initialize]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidate(
      value: js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[Initialize], Double])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(null)
        ret
    }
  }
  
}

