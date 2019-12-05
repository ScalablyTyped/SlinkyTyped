package typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Types

import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.`null`
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.`object`
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.array
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.boolean
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.date
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.documentid
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.fieldvalue
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.geopoint
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.number
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.reference
import typingsSlinky.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.string
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

