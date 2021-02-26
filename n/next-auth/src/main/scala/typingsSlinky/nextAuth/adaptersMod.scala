package typingsSlinky.nextAuth

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nextAuth.anon.ModelMapping
import typingsSlinky.nextAuth.anon.Models
import typingsSlinky.nextAuth.anon.`0`
import typingsSlinky.nextAuth.clientMod.SessionProvider
import typingsSlinky.nextAuth.mod.AppOptions
import typingsSlinky.nextAuth.mod.User
import typingsSlinky.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typingsSlinky.typeorm.entitySchemaEntitySchemaOptionsMod.EntitySchemaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptersMod extends Shortcut {
  
  @JSImport("next-auth/adapters", JSImport.Default)
  @js.native
  val default: Adapters = js.native
  
  @js.native
  trait Adapters extends StObject {
    
    var Default: js.Function2[
        /* typeOrmConfig */ ConnectionOptions, 
        /* options */ js.UndefOr[Models], 
        Adapter[_, Profile, _, _]
      ] = js.native
    
    var Prisma: PrismaAdapter = js.native
    
    var TypeORM: TypeORMAdapter[_, _, _, _] = js.native
  }
  object Adapters {
    
    @JSImport("next-auth/adapters", "Adapters")
    @js.native
    val ^ : Adapters = js.native
    
    @scala.inline
    implicit class AdaptersMutableBuilder[Self <: Adapters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(
        value: (/* typeOrmConfig */ ConnectionOptions, /* options */ js.UndefOr[Models]) => Adapter[_, Profile, _, _]
      ): Self = StObject.set(x, "Default", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrisma(value: PrismaAdapter): Self = StObject.set(x, "Prisma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeORM(value: TypeORMAdapter[_, _, _, _]): Self = StObject.set(x, "TypeORM", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("next-auth/adapters", "TypeORMAccountModel")
  @js.native
  class TypeORMAccountModel protected () extends StObject {
    def this(userId: Double, providerId: String, providerType: String, providerAccountId: String) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: js.UndefOr[scala.Nothing],
      accessToken: String
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String,
      accessToken: String
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: js.UndefOr[scala.Nothing],
      accessToken: js.UndefOr[scala.Nothing],
      accessTokenExpires: js.Date
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: js.UndefOr[scala.Nothing],
      accessToken: String,
      accessTokenExpires: js.Date
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String,
      accessToken: js.UndefOr[scala.Nothing],
      accessTokenExpires: js.Date
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String,
      accessToken: String,
      accessTokenExpires: js.Date
    ) = this()
    
    var accessToken: js.UndefOr[String] = js.native
    
    var accessTokenExpires: js.UndefOr[js.Date] = js.native
    
    var compoundId: String = js.native
    
    var providerAccountId: String = js.native
    
    var providerId: String = js.native
    
    var providerType: String = js.native
    
    var refreshToken: js.UndefOr[String] = js.native
    
    var userId: Double = js.native
  }
  
  @JSImport("next-auth/adapters", "TypeORMSessionModel")
  @js.native
  class TypeORMSessionModel protected () extends Session {
    def this(userId: Double, expires: js.Date) = this()
    def this(userId: Double, expires: js.Date, sessionToken: String) = this()
    def this(userId: Double, expires: js.Date, sessionToken: js.UndefOr[scala.Nothing], accessToken: String) = this()
    def this(userId: Double, expires: js.Date, sessionToken: String, accessToken: String) = this()
    
    @JSName("userId")
    var userId_TypeORMSessionModel: Double = js.native
  }
  
  @JSImport("next-auth/adapters", "TypeORMUserModel")
  @js.native
  class TypeORMUserModel () extends User {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], email: String) = this()
    def this(name: String, email: String) = this()
    def this(name: js.UndefOr[scala.Nothing], email: js.UndefOr[scala.Nothing], image: String) = this()
    def this(name: js.UndefOr[scala.Nothing], email: String, image: String) = this()
    def this(name: String, email: js.UndefOr[scala.Nothing], image: String) = this()
    def this(name: String, email: String, image: String) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      image: js.UndefOr[scala.Nothing],
      emailVerified: js.Date
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      email: js.UndefOr[scala.Nothing],
      image: String,
      emailVerified: js.Date
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      email: String,
      image: js.UndefOr[scala.Nothing],
      emailVerified: js.Date
    ) = this()
    def this(name: js.UndefOr[scala.Nothing], email: String, image: String, emailVerified: js.Date) = this()
    def this(
      name: String,
      email: js.UndefOr[scala.Nothing],
      image: js.UndefOr[scala.Nothing],
      emailVerified: js.Date
    ) = this()
    def this(name: String, email: js.UndefOr[scala.Nothing], image: String, emailVerified: js.Date) = this()
    def this(name: String, email: String, image: js.UndefOr[scala.Nothing], emailVerified: js.Date) = this()
    def this(name: String, email: String, image: String, emailVerified: js.Date) = this()
    
    var emailVerified: js.UndefOr[js.Date] = js.native
    
    @JSName("email")
    var email_TypeORMUserModel: js.UndefOr[String] = js.native
    
    @JSName("image")
    var image_TypeORMUserModel: js.UndefOr[String] = js.native
    
    @JSName("name")
    var name_TypeORMUserModel: js.UndefOr[String] = js.native
  }
  
  @JSImport("next-auth/adapters", "TypeORMVerificationRequestModel")
  @js.native
  class TypeORMVerificationRequestModel protected () extends VerificationRequest {
    def this(identifier: String, token: String, expires: js.Date) = this()
  }
  
  @js.native
  trait Adapter[TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */] extends StObject {
    
    def getAdapter(appOptions: AppOptions): js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]] = js.native
  }
  object Adapter {
    
    @scala.inline
    def apply[TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */](
      getAdapter: AppOptions => js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]]
    ): Adapter[TUser, TProfile, TSession, TVerificationRequest] = {
      val __obj = js.Dynamic.literal(getAdapter = js.Any.fromFunction1(getAdapter))
      __obj.asInstanceOf[Adapter[TUser, TProfile, TSession, TVerificationRequest]]
    }
    
    @scala.inline
    implicit class AdapterMutableBuilder[Self <: Adapter[_, _, _, _], TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */] (val x: Self with (Adapter[TUser, TProfile, TSession, TVerificationRequest])) extends AnyVal {
      
      @scala.inline
      def setGetAdapter(value: AppOptions => js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]]): Self = StObject.set(x, "getAdapter", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AdapterInstance[TUser, TProfile, TSession, TVerificationRequest] extends StObject {
    
    def createSession(user: TUser): js.Promise[TSession] = js.native
    
    def createUser(profile: TProfile): js.Promise[TUser] = js.native
    
    var createVerificationRequest: js.UndefOr[
        js.Function6[
          /* email */ String, 
          /* url */ String, 
          /* token */ String, 
          /* secret */ String, 
          /* provider */ EmailSessionProvider, 
          /* options */ AppOptions, 
          js.Promise[TVerificationRequest]
        ]
      ] = js.native
    
    def deleteSession(sessionToken: String): js.Promise[Unit] = js.native
    
    var deleteVerificationRequest: js.UndefOr[
        js.Function4[
          /* email */ String, 
          /* verificationToken */ String, 
          /* secret */ String, 
          /* provider */ SessionProvider, 
          js.Promise[Unit]
        ]
      ] = js.native
    
    def getSession(sessionToken: String): js.Promise[TSession | Null] = js.native
    
    def getUser(id: String): js.Promise[TUser | Null] = js.native
    
    def getUserByEmail(email: String): js.Promise[TUser | Null] = js.native
    
    def getUserByProviderAccountId(providerId: String, providerAccountId: String): js.Promise[TUser | Null] = js.native
    
    var getVerificationRequest: js.UndefOr[
        js.Function4[
          /* email */ String, 
          /* verificationToken */ String, 
          /* secret */ String, 
          /* provider */ SessionProvider, 
          js.Promise[TVerificationRequest | Null]
        ]
      ] = js.native
    
    def linkAccount(
      userId: String,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String,
      accessToken: String,
      accessTokenExpires: Double
    ): js.Promise[Unit] = js.native
    
    def updateSession(session: TSession): js.Promise[TSession] = js.native
    def updateSession(session: TSession, force: Boolean): js.Promise[TSession] = js.native
    
    def updateUser(user: TUser): js.Promise[TUser] = js.native
  }
  
  /* Inlined next-auth.next-auth/client.SessionProvider & {sendVerificationRequest (params : next-auth.next-auth/adapters.SendVerificationRequestParams): std.Promise<void>,   maxAge :number | undefined} */
  @js.native
  trait EmailSessionProvider
    extends /* key */ StringDictionary[js.Any] {
    
    var callbackUrl: String = js.native
    
    var id: String = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var name: String = js.native
    
    def sendVerificationRequest(params: SendVerificationRequestParams): js.Promise[Unit] = js.native
    
    var signinUrl: String = js.native
    
    var `type`: String = js.native
  }
  object EmailSessionProvider {
    
    @scala.inline
    def apply(
      callbackUrl: String,
      id: String,
      name: String,
      sendVerificationRequest: SendVerificationRequestParams => js.Promise[Unit],
      signinUrl: String,
      `type`: String
    ): EmailSessionProvider = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sendVerificationRequest = js.Any.fromFunction1(sendVerificationRequest), signinUrl = signinUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailSessionProvider]
    }
    
    @scala.inline
    implicit class EmailSessionProviderMutableBuilder[Self <: EmailSessionProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSendVerificationRequest(value: SendVerificationRequestParams => js.Promise[Unit]): Self = StObject.set(x, "sendVerificationRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSigninUrl(value: String): Self = StObject.set(x, "signinUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrismaAdapter extends StObject {
    
    def Adapter(config: ModelMapping): typingsSlinky.nextAuth.adaptersMod.Adapter[_, _, _, _] = js.native
  }
  object PrismaAdapter {
    
    @scala.inline
    def apply(Adapter: ModelMapping => Adapter[_, _, _, _]): PrismaAdapter = {
      val __obj = js.Dynamic.literal(Adapter = js.Any.fromFunction1(Adapter))
      __obj.asInstanceOf[PrismaAdapter]
    }
    
    @scala.inline
    implicit class PrismaAdapterMutableBuilder[Self <: PrismaAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: ModelMapping => Adapter[_, _, _, _]): Self = StObject.set(x, "Adapter", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Profile extends StObject {
    
    var email: String | Null = js.native
    
    var id: String = js.native
    
    var image: js.UndefOr[String | Null] = js.native
    
    var name: String = js.native
  }
  object Profile {
    
    @scala.inline
    def apply(id: String, name: String): Profile = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Profile]
    }
    
    @scala.inline
    implicit class ProfileMutableBuilder[Self <: Profile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailNull: Self = StObject.set(x, "email", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageNull: Self = StObject.set(x, "image", null)
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Schema[T] = EntitySchemaOptions[T]
  
  @js.native
  trait SendVerificationRequestParams extends StObject {
    
    var baseUrl: String = js.native
    
    var identifier: String = js.native
    
    var provider: SessionProvider = js.native
    
    var token: String = js.native
    
    var url: String = js.native
  }
  object SendVerificationRequestParams {
    
    @scala.inline
    def apply(baseUrl: String, identifier: String, provider: SessionProvider, token: String, url: String): SendVerificationRequestParams = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendVerificationRequestParams]
    }
    
    @scala.inline
    implicit class SendVerificationRequestParamsMutableBuilder[Self <: SendVerificationRequestParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvider(value: SessionProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Session extends StObject {
    
    var accessToken: String = js.native
    
    var expires: js.Date = js.native
    
    var sessionToken: String = js.native
    
    var userId: String | Double | js.Object = js.native
  }
  object Session {
    
    @scala.inline
    def apply(accessToken: String, expires: js.Date, sessionToken: String, userId: String | Double | js.Object): Session = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String | Double | js.Object): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * TODO: fix auto-type schema
    */
  @js.native
  trait TypeORMAdapter[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends StObject {
    
    def Adapter(typeOrmConfig: ConnectionOptions): typingsSlinky.nextAuth.adaptersMod.Adapter[U, Profile, S, VR] = js.native
    def Adapter(typeOrmConfig: ConnectionOptions, options: `0`[A, U, S, VR]): typingsSlinky.nextAuth.adaptersMod.Adapter[U, Profile, S, VR] = js.native
    
    var Models: typingsSlinky.nextAuth.anon.User = js.native
  }
  
  @js.native
  trait VerificationRequest extends StObject {
    
    var expires: js.Date = js.native
    
    var identifier: String = js.native
    
    var token: String = js.native
  }
  object VerificationRequest {
    
    @scala.inline
    def apply(expires: js.Date, identifier: String, token: String): VerificationRequest = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationRequest]
    }
    
    @scala.inline
    implicit class VerificationRequestMutableBuilder[Self <: VerificationRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Adapters
  
  /* This means you don't have to write `default`, but can instead just say `adaptersMod.foo` */
  override def _to: Adapters = default
}
