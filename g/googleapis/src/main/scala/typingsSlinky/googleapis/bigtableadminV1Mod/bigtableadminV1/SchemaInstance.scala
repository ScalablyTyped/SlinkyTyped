package typingsSlinky.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of Bigtable Tables and the resources that serve them. All
  * tables in an instance are served from all Clusters in the instance.
  */
@js.native
trait SchemaInstance extends StObject {
  
  /**
    * The descriptive name for this instance as it appears in UIs. Can be
    * changed at any time, but should be kept globally unique to avoid
    * confusion.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Labels are a flexible and lightweight mechanism for organizing cloud
    * resources into groups that reflect a customer&#39;s organizational needs
    * and deployment strategies. They can be used to filter resources and
    * aggregate metrics.  * Label keys must be between 1 and 63 characters long
    * and must conform to   the regular expression: `\p{Ll}\p{Lo}{0,62}`. *
    * Label values must be between 0 and 63 characters long and must conform to
    * the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64
    * labels can be associated with a given resource. * Keys and values must
    * both be under 128 bytes.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * (`OutputOnly`) The unique name of the instance. Values are of the form
    * `projects/&lt;project&gt;/instances/a-z+[a-z0-9]`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * (`OutputOnly`) The current state of the instance.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The type of the instance. Defaults to `PRODUCTION`.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaInstance {
  
  @scala.inline
  def apply(): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstance]
  }
  
  @scala.inline
  implicit class SchemaInstanceMutableBuilder[Self <: SchemaInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
