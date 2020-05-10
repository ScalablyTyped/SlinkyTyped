package typingsSlinky.oracleOraclejet.ojcompositeMod

import typingsSlinky.oracleOraclejet.AnonPath
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.external
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyChangedContext extends js.Object {
  var previousValue: js.Any = js.native
  var property: String = js.native
  var subproperty: js.UndefOr[AnonPath] = js.native
  var updatedFrom: external | internal = js.native
  var value: js.Any = js.native
}

object PropertyChangedContext {
  @scala.inline
  def apply(previousValue: js.Any, property: String, updatedFrom: external | internal, value: js.Any): PropertyChangedContext = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedContext]
  }
  @scala.inline
  implicit class PropertyChangedContextOps[Self <: PropertyChangedContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedFrom(value: external | internal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubproperty(value: AnonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subproperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubproperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subproperty")(js.undefined)
        ret
    }
  }
  
}

