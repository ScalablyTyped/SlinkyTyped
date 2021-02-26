package typingsSlinky.jsonapiSerializer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonapiSerializer.anon.About
import typingsSlinky.jsonapiSerializer.anon.Parameter
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.CamelCase
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.`dash-case`
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.`kebab-case`
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.`lisp-case`
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.`spinal-case`
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.camelCase_
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.snake_case
import typingsSlinky.jsonapiSerializer.jsonapiSerializerStrings.underscore_case
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonapi-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Deserializer extends StObject {
    
    def deserialize(data: js.Any): js.Promise[_] = js.native
    def deserialize(data: js.Any, callback: Callback): Unit = js.native
  }
  @JSImport("jsonapi-serializer", "Deserializer")
  @js.native
  def Deserializer: DeserializerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("jsonapi-serializer", "Deserializer")
  @js.native
  class DeserializerCls protected () extends Deserializer {
    def this(opts: DeserializerOptions) = this()
  }
  
  @scala.inline
  def Deserializer_=(x: DeserializerConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Deserializer")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("jsonapi-serializer", "Error")
  @js.native
  class Error protected () extends JSONAPIError {
    def this(opts: js.Array[JSONAPIErrorOptions]) = this()
    def this(opts: JSONAPIErrorOptions) = this()
  }
  @JSImport("jsonapi-serializer", "Error")
  @js.native
  def Error: ErrorConstructor = js.native
  @scala.inline
  def Error_=(x: ErrorConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Serializer extends StObject {
    
    def serialize(data: js.Any): js.Any = js.native
  }
  object Serializer {
    
    @JSImport("jsonapi-serializer", "Serializer")
    @js.native
    val ^ : SerializerConstructor = js.native
    
    @scala.inline
    implicit class SerializerMutableBuilder[Self <: Serializer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSerialize(value: js.Any => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("jsonapi-serializer", "Serializer")
  @js.native
  class SerializerCls protected () extends Serializer {
    def this(collectionName: String, opts: SerializerOptions) = this()
  }
  
  type Callback = js.Function2[/* error */ js.Error, /* response */ js.Any, js.Any]
  
  @js.native
  trait DeserializerConstructor extends Instantiable1[/* opts */ DeserializerOptions, Deserializer]
  
  @js.native
  trait DeserializerOptions extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var keyForAttribute: js.UndefOr[
        `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
      ] = js.native
    
    var pluralizeType: js.UndefOr[Boolean] = js.native
    
    var transform: js.UndefOr[Transform] = js.native
    
    var typeAsAttribute: js.UndefOr[Boolean] = js.native
  }
  object DeserializerOptions {
    
    @scala.inline
    def apply(): DeserializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeserializerOptions]
    }
    
    @scala.inline
    implicit class DeserializerOptionsMutableBuilder[Self <: DeserializerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKeyForAttribute(
        value: `dash-case` | `lisp-case` | `spinal-case` | `kebab-case` | underscore_case | snake_case | camelCase_ | CamelCase | KeyForAttribute
      ): Self = StObject.set(x, "keyForAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyForAttributeFunction1(value: /* attribute */ String => String): Self = StObject.set(x, "keyForAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyForAttributeUndefined: Self = StObject.set(x, "keyForAttribute", js.undefined)
      
      @scala.inline
      def setPluralizeType(value: Boolean): Self = StObject.set(x, "pluralizeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralizeTypeUndefined: Self = StObject.set(x, "pluralizeType", js.undefined)
      
      @scala.inline
      def setTransform(value: /* record */ js.Any => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTypeAsAttribute(value: Boolean): Self = StObject.set(x, "typeAsAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeAsAttributeUndefined: Self = StObject.set(x, "typeAsAttribute", js.undefined)
    }
  }
  
  @js.native
  trait ErrorConstructor
    extends Instantiable1[
          (/* opts */ js.Array[JSONAPIErrorOptions]) | (/* opts */ JSONAPIErrorOptions), 
          JSONAPIError
        ]
  
  @js.native
  trait JSONAPIError extends StObject {
    
    var errors: js.Array[_] = js.native
  }
  object JSONAPIError {
    
    @scala.inline
    def apply(errors: js.Array[_]): JSONAPIError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONAPIError]
    }
    
    @scala.inline
    implicit class JSONAPIErrorMutableBuilder[Self <: JSONAPIError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[_]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: js.Any*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  @js.native
  trait JSONAPIErrorOptions extends StObject {
    
    var code: js.UndefOr[String] = js.native
    
    var detail: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var links: js.UndefOr[About] = js.native
    
    var meta: js.UndefOr[js.Any] = js.native
    
    var source: js.UndefOr[Parameter] = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object JSONAPIErrorOptions {
    
    @scala.inline
    def apply(): JSONAPIErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONAPIErrorOptions]
    }
    
    @scala.inline
    implicit class JSONAPIErrorOptionsMutableBuilder[Self <: JSONAPIErrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLinks(value: About): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      @scala.inline
      def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setSource(value: Parameter): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type KeyForAttribute = js.Function1[/* attribute */ String, String]
  
  type LinkFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type RefFunction = js.Function2[/* current */ js.Any, /* item */ js.Any, String]
  
  @js.native
  trait Relation extends StObject {
    
    var attributes: js.UndefOr[js.Array[String]] = js.native
    
    var included: js.UndefOr[Boolean] = js.native
    
    var ref: String | RefFunction = js.native
  }
  object Relation {
    
    @scala.inline
    def apply(ref: String | RefFunction): Relation = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[Relation]
    }
    
    @scala.inline
    implicit class RelationMutableBuilder[Self <: Relation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setRef(value: String | RefFunction): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction2(value: (/* current */ js.Any, /* item */ js.Any) => String): Self = StObject.set(x, "ref", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait SerializerConstructor extends Instantiable2[/* collectionName */ String, /* opts */ SerializerOptions, Serializer]
  
  @js.native
  trait SerializerOptions extends StObject {
    
    var attributes: js.UndefOr[js.Array[String]] = js.native
    
    var dataLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
    
    var dataMeta: js.UndefOr[js.Function0[Unit] | js.Object] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var ignoreRelationshipData: js.UndefOr[Boolean] = js.native
    
    var included: js.UndefOr[Boolean] = js.native
    
    var keyForAttribute: js.UndefOr[String | KeyForAttribute] = js.native
    
    var meta: js.UndefOr[js.Object] = js.native
    
    var nullIfMissing: js.UndefOr[Boolean] = js.native
    
    var pluralizeType: js.UndefOr[Boolean] = js.native
    
    var ref: js.UndefOr[js.Function0[Unit] | Boolean | String] = js.native
    
    var relationshipLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
    
    var relationshipMeta: js.UndefOr[js.Object] = js.native
    
    var topLevelLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
    
    var transform: js.UndefOr[Transform] = js.native
    
    var typeForAttribute: js.UndefOr[TypeForAttribute] = js.native
  }
  object SerializerOptions {
    
    @scala.inline
    def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    @scala.inline
    implicit class SerializerOptionsMutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setDataLinks(value: StringDictionary[String | LinkFunction]): Self = StObject.set(x, "dataLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLinksUndefined: Self = StObject.set(x, "dataLinks", js.undefined)
      
      @scala.inline
      def setDataMeta(value: js.Function0[Unit] | js.Object): Self = StObject.set(x, "dataMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataMetaFunction0(value: () => Unit): Self = StObject.set(x, "dataMeta", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDataMetaUndefined: Self = StObject.set(x, "dataMeta", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIgnoreRelationshipData(value: Boolean): Self = StObject.set(x, "ignoreRelationshipData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreRelationshipDataUndefined: Self = StObject.set(x, "ignoreRelationshipData", js.undefined)
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setKeyForAttribute(value: String | KeyForAttribute): Self = StObject.set(x, "keyForAttribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyForAttributeFunction1(value: /* attribute */ String => String): Self = StObject.set(x, "keyForAttribute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyForAttributeUndefined: Self = StObject.set(x, "keyForAttribute", js.undefined)
      
      @scala.inline
      def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setNullIfMissing(value: Boolean): Self = StObject.set(x, "nullIfMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullIfMissingUndefined: Self = StObject.set(x, "nullIfMissing", js.undefined)
      
      @scala.inline
      def setPluralizeType(value: Boolean): Self = StObject.set(x, "pluralizeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluralizeTypeUndefined: Self = StObject.set(x, "pluralizeType", js.undefined)
      
      @scala.inline
      def setRef(value: js.Function0[Unit] | Boolean | String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction0(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRelationshipLinks(value: StringDictionary[String | LinkFunction]): Self = StObject.set(x, "relationshipLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationshipLinksUndefined: Self = StObject.set(x, "relationshipLinks", js.undefined)
      
      @scala.inline
      def setRelationshipMeta(value: js.Object): Self = StObject.set(x, "relationshipMeta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationshipMetaUndefined: Self = StObject.set(x, "relationshipMeta", js.undefined)
      
      @scala.inline
      def setTopLevelLinks(value: StringDictionary[String | LinkFunction]): Self = StObject.set(x, "topLevelLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLevelLinksUndefined: Self = StObject.set(x, "topLevelLinks", js.undefined)
      
      @scala.inline
      def setTransform(value: /* record */ js.Any => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTypeForAttribute(value: (/* attribute */ String, /* object */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "typeForAttribute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTypeForAttributeUndefined: Self = StObject.set(x, "typeForAttribute", js.undefined)
    }
  }
  
  type Transform = js.Function1[/* record */ js.Any, js.Any]
  
  type TypeForAttribute = js.Function2[/* attribute */ String, /* object */ js.UndefOr[js.Any], js.Any]
}
