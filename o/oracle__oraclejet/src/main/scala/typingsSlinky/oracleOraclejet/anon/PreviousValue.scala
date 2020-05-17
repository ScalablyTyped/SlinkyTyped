package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.external
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousValue[V]
  extends /* key */ StringDictionary[js.Any] {
  var previousValue: V = js.native
  var subproperty: Dictkey = js.native
  var updatedFrom: external | internal = js.native
  var value: V = js.native
}

object PreviousValue {
  @scala.inline
  def apply[V](previousValue: V, subproperty: Dictkey, updatedFrom: external | internal, value: V): PreviousValue[V] = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], subproperty = subproperty.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousValue[V]]
  }
  @scala.inline
  implicit class PreviousValueOps[Self[v] <: PreviousValue[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withPreviousValue(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubproperty(value: Dictkey): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subproperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedFrom(value: external | internal): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

