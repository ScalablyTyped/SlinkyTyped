package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore.Types

import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`null`
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`object`
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.array
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.boolean
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.date
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.documentid
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.fieldvalue
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.geopoint
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.number
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.reference
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeMap extends js.Object {
  var `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
  var value: js.Any
}

object TypeMap {
  @scala.inline
  def apply(
    `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string,
    value: js.Any
  ): TypeMap = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeMap]
  }
}

