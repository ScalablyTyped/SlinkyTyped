package typingsSlinky.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.firebaseUtil.cryptMod.Base64_
import typingsSlinky.firebaseUtil.errorsMod.ErrorMap
import typingsSlinky.firebaseUtil.jwtMod.DecodedToken
import typingsSlinky.firebaseUtil.subscribeMod.ErrorFn
import typingsSlinky.firebaseUtil.subscribeMod.Executor
import typingsSlinky.firebaseUtil.subscribeMod.Subscribe
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNodeMod {
  
  object CONSTANTS {
    
    @JSImport("@firebase/util/dist/index.node", "CONSTANTS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @define {boolean} Whether this is the Admin Node.js SDK.
      */
    @JSImport("@firebase/util/dist/index.node", "CONSTANTS.NODE_ADMIN")
    @js.native
    def NODE_ADMIN: Boolean = js.native
    @scala.inline
    def NODE_ADMIN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_ADMIN")(x.asInstanceOf[js.Any])
    
    /**
      * @define {boolean} Whether this is the client Node.js SDK.
      */
    @JSImport("@firebase/util/dist/index.node", "CONSTANTS.NODE_CLIENT")
    @js.native
    def NODE_CLIENT: Boolean = js.native
    @scala.inline
    def NODE_CLIENT_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_CLIENT")(x.asInstanceOf[js.Any])
    
    /**
      * Firebase SDK Version
      */
    @JSImport("@firebase/util/dist/index.node", "CONSTANTS.SDK_VERSION")
    @js.native
    def SDK_VERSION: String = js.native
    @scala.inline
    def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@firebase/util/dist/index.node", "Deferred")
  @js.native
  class Deferred[R] ()
    extends typingsSlinky.firebaseUtil.deferredMod.Deferred[R]
  
  @JSImport("@firebase/util/dist/index.node", "ErrorFactory")
  @js.native
  class ErrorFactory[ErrorCode /* <: String */, ErrorParams /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in ErrorCode ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
    */ typingsSlinky.firebaseUtil.firebaseUtilStrings.ErrorFactory with TopLevel[js.Any] */] protected ()
    extends typingsSlinky.firebaseUtil.errorsMod.ErrorFactory[ErrorCode, ErrorParams] {
    def this(service: String, serviceName: String, errors: ErrorMap[ErrorCode]) = this()
  }
  
  @JSImport("@firebase/util/dist/index.node", "FirebaseError")
  @js.native
  class FirebaseError protected ()
    extends typingsSlinky.firebaseUtil.errorsMod.FirebaseError {
    def this(code: String, message: String) = this()
    def this(code: String, message: String, customData: Record[String, _]) = this()
  }
  
  @JSImport("@firebase/util/dist/index.node", "MAX_VALUE_MILLIS")
  @js.native
  val MAX_VALUE_MILLIS: Double = js.native
  
  @JSImport("@firebase/util/dist/index.node", "RANDOM_FACTOR")
  @js.native
  val RANDOM_FACTOR: /* 0.5 */ Double = js.native
  
  @JSImport("@firebase/util/dist/index.node", "Sha1")
  @js.native
  class Sha1 ()
    extends typingsSlinky.firebaseUtil.sha1Mod.Sha1
  
  @JSImport("@firebase/util/dist/index.node", "areCookiesEnabled")
  @js.native
  def areCookiesEnabled(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "assert")
  @js.native
  def assert(assertion: js.Any, message: String): Unit = js.native
  
  @JSImport("@firebase/util/dist/index.node", "assertionError")
  @js.native
  def assertionError(message: String): js.Error = js.native
  
  @JSImport("@firebase/util/dist/index.node", "async")
  @js.native
  def async(fn: js.Function): js.Function = js.native
  @JSImport("@firebase/util/dist/index.node", "async")
  @js.native
  def async(fn: js.Function, onError: ErrorFn): js.Function = js.native
  
  @JSImport("@firebase/util/dist/index.node", "base64")
  @js.native
  val base64: Base64_ = js.native
  
  @JSImport("@firebase/util/dist/index.node", "base64Decode")
  @js.native
  def base64Decode(str: String): String | Null = js.native
  
  @JSImport("@firebase/util/dist/index.node", "base64Encode")
  @js.native
  def base64Encode(str: String): String = js.native
  
  @JSImport("@firebase/util/dist/index.node", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double): Double = js.native
  @JSImport("@firebase/util/dist/index.node", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: js.UndefOr[scala.Nothing], backoffFactor: Double): Double = js.native
  @JSImport("@firebase/util/dist/index.node", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double): Double = js.native
  @JSImport("@firebase/util/dist/index.node", "calculateBackoffMillis")
  @js.native
  def calculateBackoffMillis(backoffCount: Double, intervalMillis: Double, backoffFactor: Double): Double = js.native
  
  @JSImport("@firebase/util/dist/index.node", "contains")
  @js.native
  def contains[T /* <: js.Object */](obj: T, key: String): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "createSubscribe")
  @js.native
  def createSubscribe[T](executor: Executor[T]): Subscribe[T] = js.native
  @JSImport("@firebase/util/dist/index.node", "createSubscribe")
  @js.native
  def createSubscribe[T](executor: Executor[T], onNoObservers: Executor[T]): Subscribe[T] = js.native
  
  @JSImport("@firebase/util/dist/index.node", "decode")
  @js.native
  def decode(token: String): DecodedToken = js.native
  
  @JSImport("@firebase/util/dist/index.node", "deepCopy")
  @js.native
  def deepCopy[T](value: T): T = js.native
  
  @JSImport("@firebase/util/dist/index.node", "deepExtend")
  @js.native
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  
  @JSImport("@firebase/util/dist/index.node", "errorPrefix")
  @js.native
  def errorPrefix(fnName: String, argumentNumber: Double, optional: Boolean): String = js.native
  
  @JSImport("@firebase/util/dist/index.node", "getUA")
  @js.native
  def getUA(): String = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isAdmin")
  @js.native
  def isAdmin(token: String): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isBrowser")
  @js.native
  def isBrowser(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isBrowserExtension")
  @js.native
  def isBrowserExtension(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isElectron")
  @js.native
  def isElectron(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isEmpty")
  @js.native
  def isEmpty(obj: js.Object): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isIE")
  @js.native
  def isIE(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isIndexedDBAvailable")
  @js.native
  def isIndexedDBAvailable(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isMobileCordova")
  @js.native
  def isMobileCordova(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isNode")
  @js.native
  def isNode(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isNodeSdk")
  @js.native
  def isNodeSdk(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isReactNative")
  @js.native
  def isReactNative(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isSafari")
  @js.native
  def isSafari(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isUWP")
  @js.native
  def isUWP(): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isValidFormat")
  @js.native
  def isValidFormat(token: String): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "isValidTimestamp")
  @js.native
  def isValidTimestamp(token: String): Boolean = js.native
  
  @JSImport("@firebase/util/dist/index.node", "issuedAtTime")
  @js.native
  def issuedAtTime(token: String): Double | Null = js.native
  
  @JSImport("@firebase/util/dist/index.node", "jsonEval")
  @js.native
  def jsonEval(str: String): js.Any = js.native
  
  @JSImport("@firebase/util/dist/index.node", "map")
  @js.native
  def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typingsSlinky.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any],
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typingsSlinky.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any], 
      U
    ]
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typingsSlinky.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any] = js.native
  @JSImport("@firebase/util/dist/index.node", "map")
  @js.native
  def map[K /* <: String */, V, U](
    obj: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ typingsSlinky.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any],
    fn: js.Function3[
      /* value */ V, 
      /* key */ K, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: V}
    */ /* obj */ typingsSlinky.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any], 
      U
    ],
    contextObj: js.Any
  ): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: U}
    */ typingsSlinky.firebaseUtil.firebaseUtilStrings.map with TopLevel[js.Any] = js.native
  
  @JSImport("@firebase/util/dist/index.node", "ordinal")
  @js.native
  def ordinal(i: Double): String = js.native
  
  @JSImport("@firebase/util/dist/index.node", "querystring")
  @js.native
  def querystring(querystringParams: StringDictionary[String | Double]): String = js.native
  
  @JSImport("@firebase/util/dist/index.node", "querystringDecode")
  @js.native
  def querystringDecode(querystring: String): js.Object = js.native
  
  @JSImport("@firebase/util/dist/index.node", "safeGet")
  @js.native
  def safeGet[T /* <: js.Object */, K /* <: /* keyof T */ String */](obj: T, key: K): js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  @JSImport("@firebase/util/dist/index.node", "stringLength")
  @js.native
  def stringLength(str: String): Double = js.native
  
  @JSImport("@firebase/util/dist/index.node", "stringToByteArray")
  @js.native
  def stringToByteArray(str: String): js.Array[Double] = js.native
  
  @JSImport("@firebase/util/dist/index.node", "stringify")
  @js.native
  def stringify(data: js.Any): String = js.native
  
  @JSImport("@firebase/util/dist/index.node", "validateArgCount")
  @js.native
  def validateArgCount(fnName: String, minCount: Double, maxCount: Double, argCount: Double): Unit = js.native
  
  @JSImport("@firebase/util/dist/index.node", "validateCallback")
  @js.native
  def validateCallback(fnName: String, argumentNumber: Double, callback: js.Function, optional: Boolean): Unit = js.native
  
  @JSImport("@firebase/util/dist/index.node", "validateContextObject")
  @js.native
  def validateContextObject(fnName: String, argumentNumber: Double, context: js.Any, optional: Boolean): Unit = js.native
  
  @JSImport("@firebase/util/dist/index.node", "validateIndexedDBOpenable")
  @js.native
  def validateIndexedDBOpenable(): js.Promise[Boolean] = js.native
  
  @JSImport("@firebase/util/dist/index.node", "validateNamespace")
  @js.native
  def validateNamespace(fnName: String, argumentNumber: Double, namespace: String, optional: Boolean): Unit = js.native
}
