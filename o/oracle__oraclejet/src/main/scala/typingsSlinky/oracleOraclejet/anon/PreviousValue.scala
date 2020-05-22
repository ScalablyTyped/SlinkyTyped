package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.external
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousValue[V]
  extends /* key */ StringDictionary[js.Any] {
  var previousValue: V
  var subproperty: Dictkey
  var updatedFrom: external | internal
  var value: V
}

object PreviousValue {
  @scala.inline
  def apply[V](
    previousValue: V,
    subproperty: Dictkey,
    updatedFrom: external | internal,
    value: V,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): PreviousValue[V] = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], subproperty = subproperty.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PreviousValue[V]]
  }
}

