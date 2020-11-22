package typingsSlinky.firebase.mod.default.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for asserting ownership of a second factor. This is used to
  * facilitate enrollment of a second factor on an existing user
  * or sign-in of a user who already verified the first factor.
  *
  */
@JSImport("firebase", "auth.MultiFactorAssertion")
@js.native
abstract class MultiFactorAssertion ()
  extends typingsSlinky.firebase.mod.firebase.auth.MultiFactorAssertion
