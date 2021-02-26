package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.anon.Attributes
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataMapping
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojdataproviderMod.FetchAttribute
import typingsSlinky.oracleOraclejet.ojdataproviderMod.SortCriterion
import typingsSlinky.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojlistdataproviderviewMod {
  
  @JSImport("@oracle/oraclejet/ojlistdataproviderview", JSImport.Namespace)
  @js.native
  class ^[K, D, Kin, Din] protected () extends ListDataProviderView[K, D, Kin, Din] {
    def this(dataProvider: DataProvider[K, D]) = this()
    def this(dataProvider: DataProvider[K, D], options: Attributes[Kin, D, K, Din]) = this()
  }
  
  @js.native
  trait ListDataProviderView[K, D, Kin, Din] extends DataProvider[K, D] {
    
    def addEventListener(eventType: String, listener: EventListener): Unit = js.native
    
    var attributes: js.Array[String | FetchAttribute] = js.native
    
    var dataMapping: DataMapping[K, D, Kin, Din] = js.native
    
    var from: Kin = js.native
    
    var offset: Double = js.native
    
    def removeEventListener(eventType: String, listener: EventListener): Unit = js.native
    
    var sortCriteria: js.Array[SortCriterion[D]] = js.native
  }
}
