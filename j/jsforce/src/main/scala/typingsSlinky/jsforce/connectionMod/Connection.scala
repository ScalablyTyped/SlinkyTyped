package typingsSlinky.jsforce.connectionMod

import typingsSlinky.jsforce.analyticsMod.Analytics
import typingsSlinky.jsforce.apexMod.Apex
import typingsSlinky.jsforce.bulkMod.Bulk
import typingsSlinky.jsforce.cacheMod.Cache
import typingsSlinky.jsforce.chatterMod.Chatter
import typingsSlinky.jsforce.limitsInfoMod.LimitsInfo
import typingsSlinky.jsforce.metadataMod.Metadata
import typingsSlinky.jsforce.mod.OAuth2
import typingsSlinky.jsforce.mod.Streaming
import typingsSlinky.jsforce.queryMod.Query
import typingsSlinky.jsforce.queryMod.QueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/connection", "Connection")
@js.native
class Connection protected () extends BaseConnection {
  def this(params: ConnectionOptions) = this()
  
  var accessToken: String = js.native
  
  var analytics: Analytics = js.native
  
  var apex: Apex = js.native
  
  def authorize(code: String): js.Promise[UserInfo] = js.native
  def authorize(code: String, callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]): js.Promise[UserInfo] = js.native
  
  var bulk: Bulk = js.native
  
  var cache: Cache = js.native
  
  var chatter: Chatter = js.native
  
  def identity(): js.Promise[IdentityInfo] = js.native
  def identity(callback: js.Function2[/* err */ js.Error, /* res */ IdentityInfo, Unit]): js.Promise[IdentityInfo] = js.native
  
  def initialize(): Unit = js.native
  def initialize(options: ConnectionOptions): Unit = js.native
  
  // Specific to Connection
  var instanceUrl: String = js.native
  
  def limits(): js.Promise[LimitsInfo] = js.native
  def limits(callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]): js.Promise[LimitsInfo] = js.native
  
  def login(user: String, password: String): js.Promise[UserInfo] = js.native
  def login(
    user: String,
    password: String,
    callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
  ): js.Promise[UserInfo] = js.native
  
  def loginByOAuth2(user: String, password: String): js.Promise[UserInfo] = js.native
  def loginByOAuth2(
    user: String,
    password: String,
    callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
  ): js.Promise[UserInfo] = js.native
  
  def loginBySoap(user: String, password: String): js.Promise[UserInfo] = js.native
  def loginBySoap(
    user: String,
    password: String,
    callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
  ): js.Promise[UserInfo] = js.native
  
  def logout(): js.Promise[Unit] = js.native
  def logout(callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]): js.Promise[Unit] = js.native
  def logout(revoke: Boolean): js.Promise[Unit] = js.native
  def logout(
    revoke: Boolean,
    callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]
  ): js.Promise[Unit] = js.native
  
  def logoutByOAuth2(): js.Promise[Unit] = js.native
  def logoutByOAuth2(callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]): js.Promise[Unit] = js.native
  def logoutByOAuth2(revoke: Boolean): js.Promise[Unit] = js.native
  def logoutByOAuth2(
    revoke: Boolean,
    callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]
  ): js.Promise[Unit] = js.native
  
  def logoutBySoap(): js.Promise[Unit] = js.native
  def logoutBySoap(callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]): js.Promise[Unit] = js.native
  def logoutBySoap(revoke: Boolean): js.Promise[Unit] = js.native
  def logoutBySoap(
    revoke: Boolean,
    callback: js.Function2[/* err */ js.Error, /* res */ js.UndefOr[scala.Nothing], Unit]
  ): js.Promise[Unit] = js.native
  
  var metadata: Metadata = js.native
  
  var oauth2: OAuth2 = js.native
  
  def queryAll[T](soql: String): Query[QueryResult[T]] = js.native
  def queryAll[T](
    soql: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
  ): Query[QueryResult[T]] = js.native
  def queryAll[T](soql: String, options: js.Object): Query[QueryResult[T]] = js.native
  def queryAll[T](
    soql: String,
    options: js.Object,
    callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
  ): Query[QueryResult[T]] = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var streaming: Streaming = js.native
  
  var tooling: Tooling = js.native
  
  var userInfo: js.UndefOr[UserInfo] = js.native
  
  var version: String = js.native
}
