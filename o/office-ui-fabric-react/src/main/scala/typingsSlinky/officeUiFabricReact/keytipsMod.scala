package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.ikeytiptransitionkeyMod.IKeytipTransitionKey
import typingsSlinky.officeUiFabricReact.keytipConfigMod.IKeytipConfig
import typingsSlinky.officeUiFabricReact.keytipConfigMod.IKeytipConfigItem
import typingsSlinky.officeUiFabricReact.keytipConfigMod.IKeytipConfigMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/keytips", JSImport.Namespace)
@js.native
object keytipsMod extends js.Object {
  
  val DATAKTP_ARIA_TARGET: /* "data-ktp-aria-target" */ String = js.native
  
  val DATAKTP_EXECUTE_TARGET: /* "data-ktp-execute-target" */ String = js.native
  
  val DATAKTP_TARGET: /* "data-ktp-target" */ String = js.native
  
  val KTP_ARIA_SEPARATOR: /* ", " */ String = js.native
  
  val KTP_FULL_PREFIX: String = js.native
  
  val KTP_LAYER_ID: /* "ktp-layer-id" */ String = js.native
  
  val KTP_PREFIX: /* "ktp" */ String = js.native
  
  val KTP_SEPARATOR: /* "-" */ String = js.native
  
  def buildKeytipConfigMap(config: IKeytipConfig): IKeytipConfigMap = js.native
  
  def constructKeytip(configMap: IKeytipConfigMap, parentSequence: js.Array[String], keytip: IKeytipConfigItem): Unit = js.native
  
  def getAriaDescribedBy(keySequences: js.Array[String]): String = js.native
  
  def ktpTargetFromId(keytipId: String): String = js.native
  
  def ktpTargetFromSequences(keySequences: js.Array[String]): String = js.native
  
  def mergeOverflows(keySequences: js.Array[String], overflowKeySequences: js.Array[String]): js.Array[String] = js.native
  
  def sequencesToID(keySequences: js.Array[String]): String = js.native
  
  def transitionKeysAreEqual(key1: IKeytipTransitionKey, key2: IKeytipTransitionKey): Boolean = js.native
  
  def transitionKeysContain(keys: js.Array[IKeytipTransitionKey], key: IKeytipTransitionKey): Boolean = js.native
  
  @js.native
  object KeytipEvents extends js.Object {
    
    val ENTER_KEYTIP_MODE: /* "enterKeytipMode" */ String = js.native
    
    val EXIT_KEYTIP_MODE: /* "exitKeytipMode" */ String = js.native
    
    val KEYTIP_ADDED: /* "keytipAdded" */ String = js.native
    
    val KEYTIP_REMOVED: /* "keytipRemoved" */ String = js.native
    
    val KEYTIP_UPDATED: /* "keytipUpdated" */ String = js.native
    
    val PERSISTED_KEYTIP_ADDED: /* "persistedKeytipAdded" */ String = js.native
    
    val PERSISTED_KEYTIP_EXECUTE: /* "persistedKeytipExecute" */ String = js.native
    
    val PERSISTED_KEYTIP_REMOVED: /* "persistedKeytipRemoved" */ String = js.native
  }
  
  @js.native
  class KeytipManager ()
    extends typingsSlinky.officeUiFabricReact.keytipManagerMod.KeytipManager
  /* static members */
  @js.native
  object KeytipManager extends js.Object {
    
    var _instance: js.Any = js.native
    
    /**
      * Static function to get singleton KeytipManager instance
      *
      * @returns Singleton KeytipManager instance
      */
    def getInstance(): typingsSlinky.officeUiFabricReact.keytipManagerMod.KeytipManager = js.native
  }
}
