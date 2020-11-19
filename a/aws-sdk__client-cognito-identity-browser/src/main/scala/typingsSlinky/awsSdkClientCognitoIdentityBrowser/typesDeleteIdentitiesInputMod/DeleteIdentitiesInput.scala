package typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkTypes.abortMod.AbortSignal
import typingsSlinky.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIdentitiesInput extends InputTypesUnion {
  
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  
  /**
    * <p>A list of 1-60 identities that you want to delete.</p>
    */
  var IdentityIdsToDelete: js.Array[String] | js.Iterable[String] = js.native
}
object DeleteIdentitiesInput {
  
  @scala.inline
  def apply(IdentityIdsToDelete: js.Array[String] | js.Iterable[String]): DeleteIdentitiesInput = {
    val __obj = js.Dynamic.literal(IdentityIdsToDelete = IdentityIdsToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIdentitiesInput]
  }
  
  @scala.inline
  implicit class DeleteIdentitiesInputOps[Self <: DeleteIdentitiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentityIdsToDeleteVarargs(value: String*): Self = this.set("IdentityIdsToDelete", js.Array(value :_*))
    
    @scala.inline
    def setIdentityIdsToDeleteIterable(value: js.Iterable[String]): Self = this.set("IdentityIdsToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdsToDelete(value: js.Array[String] | js.Iterable[String]): Self = this.set("IdentityIdsToDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    
    @scala.inline
    def set$httpOptions(value: BrowserHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
  }
}
