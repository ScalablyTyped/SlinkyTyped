package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.instagramPrivateApi.accountRepositoryLoginErrorResponseMod.AccountRepositoryLoginErrorResponse
import typingsSlinky.instagramPrivateApi.checkpointResponseMod.CheckpointResponse
import typingsSlinky.instagramPrivateApi.commonTypesMod.IgResponse
import typingsSlinky.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import typingsSlinky.instagramPrivateApi.spamResponseMod.SpamResponse
import typingsSlinky.instagramPrivateApi.uploadRepositoryVideoResponseMod.UploadRepositoryVideoResponseRootObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("instagram-private-api/dist/errors", "IgActionSpamError")
  @js.native
  class IgActionSpamError protected ()
    extends typingsSlinky.instagramPrivateApi.igActionSpamErrorMod.IgActionSpamError {
    def this(response: IgResponse[SpamResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgChallengeWrongCodeError")
  @js.native
  class IgChallengeWrongCodeError ()
    extends typingsSlinky.instagramPrivateApi.igChallengeWrongCodeErrorMod.IgChallengeWrongCodeError {
    def this(message: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgCheckpointError")
  @js.native
  class IgCheckpointError protected ()
    extends typingsSlinky.instagramPrivateApi.igCheckpointErrorMod.IgCheckpointError {
    def this(response: IgResponse[CheckpointResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgClientError")
  @js.native
  class IgClientError ()
    extends typingsSlinky.instagramPrivateApi.igClientErrorMod.IgClientError {
    def this(message: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgConfigureVideoError")
  @js.native
  class IgConfigureVideoError protected ()
    extends typingsSlinky.instagramPrivateApi.igConfigureVideoErrorMod.IgConfigureVideoError {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgCookieNotFoundError")
  @js.native
  class IgCookieNotFoundError protected ()
    extends typingsSlinky.instagramPrivateApi.igCookieNotFoundErrorMod.IgCookieNotFoundError {
    def this(name: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgExactUserNotFoundError")
  @js.native
  class IgExactUserNotFoundError ()
    extends typingsSlinky.instagramPrivateApi.igExactUserNotFoundErrorMod.IgExactUserNotFoundError
  
  @JSImport("instagram-private-api/dist/errors", "IgInactiveUserError")
  @js.native
  class IgInactiveUserError protected ()
    extends typingsSlinky.instagramPrivateApi.igInactiveUserErrorMod.IgInactiveUserError {
    def this(response: IgResponse[_]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgLoginBadPasswordError")
  @js.native
  class IgLoginBadPasswordError protected ()
    extends typingsSlinky.instagramPrivateApi.igLoginBadPasswordErrorMod.IgLoginBadPasswordError {
    def this(response: IgResponse[AccountRepositoryLoginErrorResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgLoginInvalidUserError")
  @js.native
  class IgLoginInvalidUserError protected ()
    extends typingsSlinky.instagramPrivateApi.igLoginInvalidUserErrorMod.IgLoginInvalidUserError {
    def this(response: IgResponse[AccountRepositoryLoginErrorResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgLoginRequiredError")
  @js.native
  class IgLoginRequiredError protected ()
    extends typingsSlinky.instagramPrivateApi.igLoginRequiredErrorMod.IgLoginRequiredError {
    def this(response: IgResponse[LoginRequiredResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgLoginTwoFactorRequiredError")
  @js.native
  class IgLoginTwoFactorRequiredError protected ()
    extends typingsSlinky.instagramPrivateApi.igLoginTwoFactorRequiredErrorMod.IgLoginTwoFactorRequiredError {
    def this(response: IgResponse[AccountRepositoryLoginErrorResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgNetworkError")
  @js.native
  class IgNetworkError protected ()
    extends typingsSlinky.instagramPrivateApi.igNetworkErrorMod.IgNetworkError {
    def this(e: js.Error) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgNoCheckpointError")
  @js.native
  class IgNoCheckpointError ()
    extends typingsSlinky.instagramPrivateApi.igNoCheckpointErrorMod.IgNoCheckpointError {
    def this(message: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgNotFoundError")
  @js.native
  class IgNotFoundError protected ()
    extends typingsSlinky.instagramPrivateApi.igNotFoundErrorMod.IgNotFoundError {
    def this(response: IgResponse[_]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgParseError")
  @js.native
  class IgParseError protected ()
    extends typingsSlinky.instagramPrivateApi.igParseErrorMod.IgParseError {
    def this(body: String) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgPrivateUserError")
  @js.native
  class IgPrivateUserError protected ()
    extends typingsSlinky.instagramPrivateApi.igPrivateUserErrorMod.IgPrivateUserError {
    def this(response: IgResponse[_]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgRequestsLimitError")
  @js.native
  class IgRequestsLimitError ()
    extends typingsSlinky.instagramPrivateApi.igRequestsLimitErrorMod.IgRequestsLimitError
  
  @JSImport("instagram-private-api/dist/errors", "IgResponseError")
  @js.native
  class IgResponseError[TBody /* <: StringDictionary[js.Any] */] protected ()
    extends typingsSlinky.instagramPrivateApi.igResponseErrorMod.IgResponseError[TBody] {
    def this(response: IgResponse[TBody]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgSentryBlockError")
  @js.native
  class IgSentryBlockError protected ()
    extends typingsSlinky.instagramPrivateApi.igSentryBlockErrorMod.IgSentryBlockError {
    def this(response: IgResponse[_]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgUploadVideoError")
  @js.native
  class IgUploadVideoError protected ()
    extends typingsSlinky.instagramPrivateApi.igUploadVideoErrorMod.IgUploadVideoError {
    def this(response: IgResponse[UploadRepositoryVideoResponseRootObject], videoInfo: js.Any) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgUserHasLoggedOutError")
  @js.native
  class IgUserHasLoggedOutError protected ()
    extends typingsSlinky.instagramPrivateApi.igUserHasLoggedOutErrorMod.IgUserHasLoggedOutError {
    def this(response: IgResponse[LoginRequiredResponse]) = this()
  }
  
  @JSImport("instagram-private-api/dist/errors", "IgUserIdNotFoundError")
  @js.native
  class IgUserIdNotFoundError ()
    extends typingsSlinky.instagramPrivateApi.igUserIdNotFoundErrorMod.IgUserIdNotFoundError
}
