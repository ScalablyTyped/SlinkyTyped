package typingsSlinky.msRestAzure.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify adal.TokenResponse * / any */ @js.native
trait TokenResponse
  extends /* x */ StringDictionary[js.Any] {
  /**
    * @property {number} [notBefore] The time from which the access token becomes usable.
    * The date is represented as the number of seconds from 1970-01-01T0:0:0Z UTC until time of validity for the token.
    */
  var notBefore: js.UndefOr[Double] = js.native
}

object TokenResponse {
  @scala.inline
  def apply(): TokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenResponse]
  }
  @scala.inline
  implicit class TokenResponseOps[Self <: TokenResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotBefore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notBefore")(js.undefined)
        ret
    }
  }
  
}

