package typingsSlinky.maximMazurokGapiClientFactchecktools.gapi.client.factchecktools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor extends js.Object {
  
  /** Corresponds to `ClaimReview.itemReviewed.author.image`. */
  var imageUrl: js.UndefOr[String] = js.native
  
  /** Corresponds to `ClaimReview.itemReviewed.author.jobTitle`. */
  var jobTitle: js.UndefOr[String] = js.native
  
  /** A person or organization stating the claim. For instance, "John Doe". Corresponds to `ClaimReview.itemReviewed.author.name`. */
  var name: js.UndefOr[String] = js.native
  
  /** Corresponds to `ClaimReview.itemReviewed.author.sameAs`. */
  var sameAs: js.UndefOr[String] = js.native
}
object GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor {
  
  @scala.inline
  def apply(): GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor]
  }
  
  @scala.inline
  implicit class GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthorOps[Self <: GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] (val x: Self) extends AnyVal {
    
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
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setJobTitle(value: String): Self = this.set("jobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTitle: Self = this.set("jobTitle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSameAs(value: String): Self = this.set("sameAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameAs: Self = this.set("sameAs", js.undefined)
  }
}
