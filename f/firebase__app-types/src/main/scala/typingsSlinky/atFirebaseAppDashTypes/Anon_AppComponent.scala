package typingsSlinky.atFirebaseAppDashTypes

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseNamespace
import typingsSlinky.atFirebaseAppDashTypes.privateMod.FirebaseService
import typingsSlinky.atFirebaseAppDashTypes.privateMod.FirebaseServiceNamespace
import typingsSlinky.atFirebaseUtil.distSrcErrorsMod.ErrorMap
import typingsSlinky.atFirebaseUtil.distSrcSubscribeMod.Observer
import typingsSlinky.atFirebaseUtil.distSrcSubscribeMod.Subscribe
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AppComponent extends js.Object {
  /**
    * Use to construct all thrown FirebaseError's.
    */
  var ErrorFactory: Instantiable3[
    /* service */ String, 
    /* serviceName */ String, 
    /* errors */ ErrorMap[/* import warning: RewrittenClass.unapply cls was tparam ErrorCode */ js.Any], 
    typingsSlinky.atFirebaseUtil.atFirebaseUtilMod.ErrorFactory[
      String, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in / * import warning: RewrittenClass.unapply cls was tparam ErrorCode * / any ]:? @firebase/util.@firebase/util/dist/src/errors.ErrorData}
    */ typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesStrings.Anon_AppComponent with js.Any
    ]
  ] = js.native
  /**
    * registered components.
    */
  var components: Map[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ _
  ] = js.native
  /**
    * Just used for testing to start from a fresh namespace.
    */
  def createFirebaseNamespace(): FirebaseNamespace = js.native
  /**
    * Create a Subscribe function.  A proxy Observer is created so that
    * events can be sent to single Observer to be fanned out automatically.
    */
  def createSubscribe[T](executor: js.Function1[/* observer */ Observer[T], Unit]): Subscribe[T] = js.native
  def createSubscribe[T](
    executor: js.Function1[/* observer */ Observer[T], Unit],
    onNoObservers: js.Function1[/* observer */ Observer[T], Unit]
  ): Subscribe[T] = js.native
  /**
    * Utility exposed for internal testing.
    */
  def deepExtend(target: js.Any, source: js.Any): js.Any = js.native
  /**
    * Internal API to install properties on the top-level firebase namespace.
    * @prop props The top level properties of this object are copied to the
    *   namespace.
    */
  def extendNamespace(props: StringDictionary[js.Any]): Unit = js.native
  /**
    * Internal API to register a Firebase Service into the firebase namespace.
    *
    * Each service will create a child namespace (firebase.<name>) which acts as
    * both a namespace for service specific properties, and also as a service
    * accessor function (firebase.<name>() or firebase.<name>(app)).
    *
    * @param name The Firebase Service being registered.
    * @param createService Factory function to create a service instance.
    * @param serviceProperties Properties to copy to the service's namespace.
    * @param appHook All appHooks called before initializeApp returns to caller.
    * @param allowMultipleInstances Whether the registered service supports
    *   multiple instances per app. If not specified, the default is false.
    */
  def registerComponent(
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component */ js.Any
  ): FirebaseServiceNamespace[FirebaseService] | Null = js.native
  /**
    * Internal API to remove an app from the list of registered apps.
    */
  def removeApp(name: String): Unit = js.native
  /*
    * Convert service name to factory name to use.
    */
  def useAsService(app: FirebaseApp, serviceName: String): String | Null = js.native
}

