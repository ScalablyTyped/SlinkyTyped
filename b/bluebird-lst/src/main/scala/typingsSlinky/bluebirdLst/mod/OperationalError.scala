package typingsSlinky.bluebirdLst.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an error is an explicit promise rejection as opposed to a thrown error.
  *  For example, if an error is errbacked by a callback API promisified through undefined or undefined
  *  and is not a typed error, it will be converted to a `OperationalError` which has the original error in
  *  the `.cause` property.
  *
  * `OperationalError`s are caught in `.error` handlers.
  */
@JSImport("bluebird-lst", "OperationalError")
@js.native
class OperationalError () extends Error
