package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Api is a light-weight descriptor for an API Interface.  Interfaces are also
  * described as &quot;protocol buffer services&quot; in some contexts, such as
  * by the &quot;service&quot; keyword in a .proto file, but they are different
  * from API Services, which represent a concrete implementation of an
  * interface as opposed to simply a description of methods and bindings. They
  * are also sometimes simply referred to as &quot;APIs&quot; in other
  * contexts, such as the name of this message itself. See
  * https://cloud.google.com/apis/design/glossary for detailed terminology.
  */
@js.native
trait SchemaApi extends StObject {
  
  /**
    * The methods of this interface, in unspecified order.
    */
  var methods: js.UndefOr[js.Array[SchemaMethod]] = js.native
  
  /**
    * Included interfaces. See Mixin.
    */
  var mixins: js.UndefOr[js.Array[SchemaMixin]] = js.native
  
  /**
    * The fully qualified name of this interface, including package name
    * followed by the interface&#39;s simple name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Any metadata attached to the interface.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  
  /**
    * Source context for the protocol buffer service represented by this
    * message.
    */
  var sourceContext: js.UndefOr[SchemaSourceContext] = js.native
  
  /**
    * The source syntax of the service.
    */
  var syntax: js.UndefOr[String] = js.native
  
  /**
    * A version string for this interface. If specified, must have the form
    * `major-version.minor-version`, as in `1.10`. If the minor version is
    * omitted, it defaults to zero. If the entire version field is empty, the
    * major version is derived from the package name, as outlined below. If the
    * field is not empty, the version in the package name will be verified to
    * be consistent with what is provided here.  The versioning schema uses
    * [semantic versioning](http://semver.org) where the major version number
    * indicates a breaking change and the minor version an additive,
    * non-breaking change. Both version numbers are signals to users what to
    * expect from different versions, and should be carefully chosen based on
    * the product plan.  The major version is also reflected in the package
    * name of the interface, which must end in `v&lt;major-version&gt;`, as in
    * `google.feature.v1`. For major versions 0 and 1, the suffix can be
    * omitted. Zero major versions must only be used for experimental, non-GA
    * interfaces.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaApi {
  
  @scala.inline
  def apply(): SchemaApi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApi]
  }
  
  @scala.inline
  implicit class SchemaApiMutableBuilder[Self <: SchemaApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethods(value: js.Array[SchemaMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: SchemaMethod*): Self = StObject.set(x, "methods", js.Array(value :_*))
    
    @scala.inline
    def setMixins(value: js.Array[SchemaMixin]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
    
    @scala.inline
    def setMixinsVarargs(value: SchemaMixin*): Self = StObject.set(x, "mixins", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[SchemaOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: SchemaOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSourceContext(value: SchemaSourceContext): Self = StObject.set(x, "sourceContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceContextUndefined: Self = StObject.set(x, "sourceContext", js.undefined)
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "syntax", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
