package typingsSlinky.firebaseInstallations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object errorsMod {
  type ServerError = typingsSlinky.firebaseUtil.mod.FirebaseError with typingsSlinky.firebaseInstallations.errorsMod.ServerErrorData
}
