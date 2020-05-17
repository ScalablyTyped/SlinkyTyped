package typingsSlinky.googleCloudStorage.storageMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typingsSlinky.std.PromiseConstructor
import typingsSlinky.std.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageOptions extends GoogleAuthOptions {
  /**
    * The API endpoint of the service used to make requests.
    * Defaults to `storage.googleapis.com`.
    */
  var apiEndpoint: js.UndefOr[String] = js.native
  var autoRetry: js.UndefOr[Boolean] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
  var promise: js.UndefOr[
    PromiseConstructor with (Instantiable1[
      /* executor */ js.Function2[
        /* resolve */ js.Function1[
          /* value */ js.UndefOr[
            (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
          ], 
          Unit
        ], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ], 
      Promise[js.Object]
    ])
  ] = js.native
}

object StorageOptions {
  @scala.inline
  def apply(): StorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageOptions]
  }
  @scala.inline
  implicit class StorageOptionsOps[Self <: StorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoRetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRetry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRetry")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(
      value: PromiseConstructor with (Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ js.UndefOr[
                (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any])
              ], 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          Promise[js.Object]
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
  }
  
}

