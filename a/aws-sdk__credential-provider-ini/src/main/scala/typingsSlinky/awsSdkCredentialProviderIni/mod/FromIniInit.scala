package typingsSlinky.awsSdkCredentialProviderIni.mod

import typingsSlinky.awsSdkSharedIniFileLoader.mod.SharedConfigFiles
import typingsSlinky.awsSdkSharedIniFileLoader.mod.SharedConfigInit
import typingsSlinky.awsSdkTypes.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FromIniInit extends SharedConfigInit {
  /**
    * A promise that will be resolved with loaded and parsed credentials files.
    * Used to avoid loading shared config files multiple times.
    */
  var loadedConfig: js.UndefOr[js.Promise[SharedConfigFiles]] = js.native
  /**
    * A function that returna a promise fulfilled with an MFA token code for
    * the provided MFA Serial code. If a profile requires an MFA code and
    * `mfaCodeProvider` is not a valid function, the credential provider
    * promise will be rejected.
    *
    * @param mfaSerial The serial code of the MFA device specified.
    */
  var mfaCodeProvider: js.UndefOr[js.Function1[/* mfaSerial */ String, js.Promise[String]]] = js.native
  /**
    * The configuration profile to use.
    */
  var profile: js.UndefOr[String] = js.native
  /**
    * A function that assumes a role and returns a promise fulfilled with
    * credentials for the assumed role.
    *
    * @param sourceCreds The credentials with which to assume a role.
    * @param params
    */
  var roleAssumer: js.UndefOr[
    js.Function2[
      /* sourceCreds */ Credentials, 
      /* params */ AssumeRoleParams, 
      js.Promise[Credentials]
    ]
  ] = js.native
}

object FromIniInit {
  @scala.inline
  def apply(): FromIniInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FromIniInit]
  }
  @scala.inline
  implicit class FromIniInitOps[Self <: FromIniInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoadedConfig(value: js.Promise[SharedConfigFiles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadedConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMfaCodeProvider(value: /* mfaSerial */ String => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfaCodeProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMfaCodeProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mfaCodeProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleAssumer(value: (/* sourceCreds */ Credentials, /* params */ AssumeRoleParams) => js.Promise[Credentials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAssumer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRoleAssumer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleAssumer")(js.undefined)
        ret
    }
  }
  
}

