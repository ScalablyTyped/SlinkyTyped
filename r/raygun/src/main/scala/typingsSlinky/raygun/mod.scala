package typingsSlinky.raygun

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.raygun.raygunBatchMod.RaygunBatchTransport
import typingsSlinky.raygun.typesMod.CustomData
import typingsSlinky.raygun.typesMod.Hook
import typingsSlinky.raygun.typesMod.IOfflineStorage
import typingsSlinky.raygun.typesMod.Message
import typingsSlinky.raygun.typesMod.OfflineStorageOptions
import typingsSlinky.raygun.typesMod.RawUserData
import typingsSlinky.raygun.typesMod.RaygunOptions
import typingsSlinky.raygun.typesMod.Tag
import typingsSlinky.raygun.typesMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("raygun", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("raygun", "default.Client")
    @js.native
    class Client () extends Raygun
    @JSImport("raygun", "default.Client")
    @js.native
    def Client: Instantiable0[Raygun] = js.native
    @scala.inline
    def Client_=(x: Instantiable0[Raygun]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Client")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("raygun", "Client")
  @js.native
  class Client () extends Raygun
  @JSImport("raygun", "Client")
  @js.native
  val Client: Instantiable0[Raygun] = js.native
  
  @js.native
  trait Raygun extends StObject {
    
    var _apiKey: js.UndefOr[String] = js.native
    
    var _batch: Boolean = js.native
    
    var _batchTransport: js.UndefOr[RaygunBatchTransport] = js.native
    
    var _filters: js.Array[String] = js.native
    
    var _groupingKey: js.UndefOr[Hook[String]] = js.native
    
    var _host: js.UndefOr[String] = js.native
    
    var _innerErrorFieldName: js.UndefOr[String] = js.native
    
    var _isOffline: js.UndefOr[Boolean] = js.native
    
    var _offlineStorage: js.UndefOr[IOfflineStorage] = js.native
    
    var _offlineStorageOptions: js.UndefOr[OfflineStorageOptions] = js.native
    
    var _onBeforeSend: js.UndefOr[Hook[Message]] = js.native
    
    var _port: js.UndefOr[Double] = js.native
    
    var _reportColumnNumbers: js.UndefOr[Boolean] = js.native
    
    var _tags: js.UndefOr[js.Array[Tag]] = js.native
    
    var _useHumanStringForObject: js.UndefOr[Boolean] = js.native
    
    var _useSSL: js.UndefOr[Boolean] = js.native
    
    var _user: js.UndefOr[RawUserData] = js.native
    
    var _version: String = js.native
    
    def expressCustomData(error: js.Error, request: Request_[ParamsDictionary, _, _, Query]): js.Object = js.native
    
    def expressHandler(err: js.Error, req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): Unit = js.native
    
    def groupingKey(groupingKey: Hook[String]): this.type = js.native
    
    def init(options: RaygunOptions): this.type = js.native
    
    def offline(): Unit = js.native
    
    var offlineStorage: js.Any = js.native
    
    def onBeforeSend(onBeforeSend: Hook[Message]): this.type = js.native
    
    def online(): Unit = js.native
    def online(callback: SendCB): Unit = js.native
    
    def send(exception: String): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: String,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: String, customData: CustomData): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: String, customData: CustomData, callback: js.Function1[/* err */ js.Error | Null, Unit]): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: String,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: js.Error): Message = js.native
    def send(
      exception: js.Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(exception: js.Error, customData: CustomData): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.UndefOr[scala.Nothing],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: js.UndefOr[scala.Nothing],
      tags: js.Array[Tag]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query]
    ): Message = js.native
    def send(
      exception: js.Error,
      customData: CustomData,
      callback: js.Function1[/* err */ js.Error | Null, Unit],
      request: Request_[ParamsDictionary, _, _, Query],
      tags: js.Array[Tag]
    ): Message = js.native
    
    def setTags(tags: js.Array[Tag]): Unit = js.native
    
    def setUser(user: RawUserData): this.type = js.native
    
    def setVersion(version: String): this.type = js.native
    
    def stop(): Unit = js.native
    
    def transport(): Transport = js.native
    
    def user(req: Request_[ParamsDictionary, _, _, Query]): RawUserData | Null = js.native
  }
  
  type SendCB = js.Function2[/* error */ js.Error | Null, /* items */ js.UndefOr[js.Array[String]], Unit]
}
