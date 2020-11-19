package typingsSlinky.googleCloudCommon.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.googleCloudCommon.utilMod.ApiError
import typingsSlinky.googleCloudCommon.utilMod.GoogleErrorBody
import typingsSlinky.googleCloudCommon.utilMod.GoogleInnerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofApiError extends Instantiable1[/* errorMessage */ String, ApiError] {
  
  /**
    * Pieces together an error message by combining all unique error messages
    * returned from a single GoogleError
    *
    * @private
    *
    * @param {GoogleErrorBody} err The original error.
    * @param {GoogleInnerError[]} [errors] Inner errors, if any.
    * @returns {string}
    */
  def createMultiErrorMessage(err: GoogleErrorBody): String = js.native
  def createMultiErrorMessage(err: GoogleErrorBody, errors: js.Array[GoogleInnerError]): String = js.native
}
