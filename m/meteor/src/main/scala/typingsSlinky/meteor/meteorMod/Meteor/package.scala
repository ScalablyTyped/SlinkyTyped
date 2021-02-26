package typingsSlinky.meteor.meteorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Meteor {
  
  type EventMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.meteor.meteorMod.Meteor.EventHandlerFunction]
  
  @scala.inline
  def apply[Result /* <: typingsSlinky.meteor.EJSONable | (js.Array[typingsSlinky.meteor.EJSONable | typingsSlinky.meteor.EJSONableProperty]) | typingsSlinky.meteor.EJSONableProperty */](
    name: java.lang.String,
    args: js.Array[typingsSlinky.meteor.EJSONable | typingsSlinky.meteor.EJSONableProperty]
  ): js.Any = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply[Result /* <: typingsSlinky.meteor.EJSONable | (js.Array[typingsSlinky.meteor.EJSONable | typingsSlinky.meteor.EJSONableProperty]) | typingsSlinky.meteor.EJSONableProperty */](
    name: java.lang.String,
    args: js.Array[typingsSlinky.meteor.EJSONable | typingsSlinky.meteor.EJSONableProperty],
    options: js.UndefOr[scala.Nothing],
    asyncCallback: js.Function2[
      /* error */ js.UndefOr[js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error], 
      /* result */ js.UndefOr[Result], 
      scala.Unit
    ]
  ): js.Any = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply[Result /* <: typingsSlinky.meteor.EJSONable | (js.Array[typingsSlinky.meteor.EJSONable | typingsSlinky.meteor.EJSONableProperty]) | typingsSlinky.meteor.EJSONableProperty */](
    name: java.lang.String,
    args: js.Array[typingsSlinky.meteor.EJSONable | typingsSlinky.meteor.EJSONableProperty],
    options: typingsSlinky.meteor.anon.OnResultReceived[Result]
  ): js.Any = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def apply[Result /* <: typingsSlinky.meteor.EJSONable | (js.Array[typingsSlinky.meteor.EJSONable | typingsSlinky.meteor.EJSONableProperty]) | typingsSlinky.meteor.EJSONableProperty */](
    name: java.lang.String,
    args: js.Array[typingsSlinky.meteor.EJSONable | typingsSlinky.meteor.EJSONableProperty],
    options: typingsSlinky.meteor.anon.OnResultReceived[Result],
    asyncCallback: js.Function2[
      /* error */ js.UndefOr[js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error], 
      /* result */ js.UndefOr[Result], 
      scala.Unit
    ]
  ): js.Any = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def bindEnvironment[TFunc /* <: js.Function */](func: TFunc): TFunc = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("bindEnvironment")(func.asInstanceOf[js.Any]).asInstanceOf[TFunc]
  
  @scala.inline
  def call(name: java.lang.String, args: js.Any*): js.Any = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("call")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def clearInterval(id: scala.Double): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def clearTimeout(id: scala.Double): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def debug(args: js.Any*): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("_debug")(args.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def defer(func: js.Function): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("defer")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def disconnect(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[scala.Unit]
  
  /** Global props **/
  @scala.inline
  def isClient: scala.Boolean = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isClient").asInstanceOf[scala.Boolean]
  @scala.inline
  def isClient_=(x: scala.Boolean): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def isCordova: scala.Boolean = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isCordova").asInstanceOf[scala.Boolean]
  @scala.inline
  def isCordova_=(x: scala.Boolean): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isCordova")(x.asInstanceOf[js.Any])
  
  /** Global props **/
  @scala.inline
  def isDevelopment: scala.Boolean = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isDevelopment").asInstanceOf[scala.Boolean]
  @scala.inline
  def isDevelopment_=(x: scala.Boolean): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isDevelopment")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def isProduction: scala.Boolean = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isProduction").asInstanceOf[scala.Boolean]
  @scala.inline
  def isProduction_=(x: scala.Boolean): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def isServer: scala.Boolean = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isServer").asInstanceOf[scala.Boolean]
  @scala.inline
  def isServer_=(x: scala.Boolean): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def isTest: scala.Boolean = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isTest").asInstanceOf[scala.Boolean]
  @scala.inline
  def isTest_=(x: scala.Boolean): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def loggingIn(): scala.Boolean = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def loggingOut(): scala.Boolean = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loggingOut")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def loginWith[ExternalService](): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")().asInstanceOf[scala.Unit]
  @scala.inline
  def loginWith[ExternalService](
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWith[ExternalService](options: typingsSlinky.meteor.anon.LoginStyle): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWith[ExternalService](
    options: typingsSlinky.meteor.anon.LoginStyle,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithFacebook(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")().asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithFacebook(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithFacebook(options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithFacebook(
    options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithGithub(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")().asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithGithub(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithGithub(options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithGithub(
    options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithGoogle(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")().asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithGoogle(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithGoogle(options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithGoogle(
    options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithMeetup(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")().asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithMeetup(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithMeetup(options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithMeetup(
    options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithMeteorDeveloperAccount(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")().asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithMeteorDeveloperAccount(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithMeteorDeveloperAccount(options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithMeteorDeveloperAccount(
    options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithPassword(user: java.lang.String, password: java.lang.String): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithPassword(
    user: java.lang.String,
    password: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithPassword(user: js.Object, password: java.lang.String): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithPassword(
    user: js.Object,
    password: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithToken(token: java.lang.String): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithToken(
    token: java.lang.String,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithTwitter(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")().asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithTwitter(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithTwitter(options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithTwitter(
    options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loginWithWeibo(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")().asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithWeibo(
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithWeibo(options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def loginWithWeibo(
    options: typingsSlinky.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logout(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[scala.Unit]
  @scala.inline
  def logout(
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def logoutOtherClients(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[scala.Unit]
  @scala.inline
  def logoutOtherClients(
    callback: js.Function1[
      /* error */ js.UndefOr[
        js.Error | typingsSlinky.meteor.meteorMod.Meteor.Error | typingsSlinky.meteor.meteorMod.Meteor.TypedError
      ], 
      scala.Unit
    ]
  ): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def methods(
    methods: org.scalablytyped.runtime.StringDictionary[
      js.ThisFunction1[
        /* this */ typingsSlinky.meteor.meteorMod.Meteor.MethodThisType, 
        /* repeated */ js.Any, 
        _
      ]
    ]
  ): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def onConnection(
    callback: js.Function1[/* connection */ typingsSlinky.meteor.meteorMod.Meteor.Connection, scala.Unit]
  ): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("onConnection")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /** Connection **/
  @scala.inline
  def publish(
    name: java.lang.String,
    func: js.ThisFunction1[
      /* this */ typingsSlinky.meteor.meteorMod.Subscription, 
      /* repeated */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def publish(
    name: java.lang.String,
    func: js.ThisFunction1[
      /* this */ typingsSlinky.meteor.meteorMod.Subscription, 
      /* repeated */ js.Any, 
      scala.Unit
    ],
    options: typingsSlinky.meteor.anon.Isauto
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def publish(
    name: scala.Null,
    func: js.ThisFunction1[
      /* this */ typingsSlinky.meteor.meteorMod.Subscription, 
      /* repeated */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def publish(
    name: scala.Null,
    func: js.ThisFunction1[
      /* this */ typingsSlinky.meteor.meteorMod.Subscription, 
      /* repeated */ js.Any, 
      scala.Unit
    ],
    options: typingsSlinky.meteor.anon.Isauto
  ): scala.Unit = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /** Event **/
  /** Connection **/
  @scala.inline
  def reconnect(): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def release: java.lang.String = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("release").asInstanceOf[java.lang.String]
  @scala.inline
  def release_=(x: java.lang.String): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
  
  /** Url **/
  /** Timeout **/
  @scala.inline
  def setInterval(func: js.Function, delay: scala.Double): scala.Double = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def setTimeout(func: js.Function, delay: scala.Double): scala.Double = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
  
  @scala.inline
  def settings: typingsSlinky.meteor.meteorMod.Meteor.Settings_ = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("settings").asInstanceOf[typingsSlinky.meteor.meteorMod.Meteor.Settings_]
  @scala.inline
  def settings_=(x: typingsSlinky.meteor.meteorMod.Meteor.Settings_): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
  
  /** Timeout **/
  /** utils **/
  @scala.inline
  def startup(func: js.Function): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("startup")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /** Connection **/
  /** Status **/
  @scala.inline
  def status(): typingsSlinky.meteor.DDP.DDPStatus = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[typingsSlinky.meteor.DDP.DDPStatus]
  
  /** Status **/
  /** Pub/Sub **/
  @scala.inline
  def subscribe(name: java.lang.String, args: js.Any*): typingsSlinky.meteor.meteorMod.Meteor.SubscriptionHandle = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.meteor.meteorMod.Meteor.SubscriptionHandle]
  
  @scala.inline
  def user(): typingsSlinky.meteor.meteorMod.Meteor.User_ | scala.Null = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[typingsSlinky.meteor.meteorMod.Meteor.User_ | scala.Null]
  
  @scala.inline
  def userId(): java.lang.String | scala.Null = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def users: typingsSlinky.meteor.Mongo.Collection[
    typingsSlinky.meteor.meteorMod.Meteor.User_, 
    typingsSlinky.meteor.meteorMod.Meteor.User_
  ] = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("users").asInstanceOf[typingsSlinky.meteor.Mongo.Collection[
    typingsSlinky.meteor.meteorMod.Meteor.User_, 
    typingsSlinky.meteor.meteorMod.Meteor.User_
  ]]
  @scala.inline
  def users_=(
    x: typingsSlinky.meteor.Mongo.Collection[
      typingsSlinky.meteor.meteorMod.Meteor.User_, 
      typingsSlinky.meteor.meteorMod.Meteor.User_
    ]
  ): scala.Unit = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("users")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def wrapAsync(func: js.Function): js.Any = typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def wrapAsync(func: js.Function, context: js.Object): js.Any = (typingsSlinky.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
