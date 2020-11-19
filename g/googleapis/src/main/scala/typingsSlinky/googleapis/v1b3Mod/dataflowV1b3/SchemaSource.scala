package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A source that records can be read and decoded from.
  */
@js.native
trait SchemaSource extends js.Object {
  
  /**
    * While splitting, sources may specify the produced bundles as differences
    * against another source, in order to save backend-side memory and allow
    * bigger jobs. For details, see SourceSplitRequest. To support this use
    * case, the full set of parameters of the source is logically obtained by
    * taking the latest explicitly specified value of each parameter in the
    * order: base_specs (later items win), spec (overrides anything in
    * base_specs).
    */
  var baseSpecs: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  
  /**
    * The codec to use to decode data read from the source.
    */
  var codec: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Setting this value to true hints to the framework that the source
    * doesn&#39;t need splitting, and using SourceSplitRequest on it would
    * yield SOURCE_SPLIT_OUTCOME_USE_CURRENT.  E.g. a file splitter may set
    * this to true when splitting a single file into a set of byte ranges of
    * appropriate size, and set this to false when splitting a filepattern into
    * individual files. However, for efficiency, a file splitter may decide to
    * produce file subranges directly from the filepattern to avoid a splitting
    * round-trip.  See SourceSplitRequest for an overview of the splitting
    * process.  This field is meaningful only in the Source objects populated
    * by the user (e.g. when filling in a DerivedSource). Source objects
    * supplied by the framework to the user don&#39;t have this field
    * populated.
    */
  var doesNotNeedSplitting: js.UndefOr[Boolean] = js.native
  
  /**
    * Optionally, metadata for this source can be supplied right away, avoiding
    * a SourceGetMetadataOperation roundtrip (see SourceOperationRequest). This
    * field is meaningful only in the Source objects populated by the user
    * (e.g. when filling in a DerivedSource). Source objects supplied by the
    * framework to the user don&#39;t have this field populated.
    */
  var metadata: js.UndefOr[SchemaSourceMetadata] = js.native
  
  /**
    * The source to read from, plus its parameters.
    */
  var spec: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaSource {
  
  @scala.inline
  def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  @scala.inline
  implicit class SchemaSourceOps[Self <: SchemaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBaseSpecsVarargs(value: StringDictionary[js.Any]*): Self = this.set("baseSpecs", js.Array(value :_*))
    
    @scala.inline
    def setBaseSpecs(value: js.Array[StringDictionary[_]]): Self = this.set("baseSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseSpecs: Self = this.set("baseSpecs", js.undefined)
    
    @scala.inline
    def setCodec(value: StringDictionary[js.Any]): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("codec", js.undefined)
    
    @scala.inline
    def setDoesNotNeedSplitting(value: Boolean): Self = this.set("doesNotNeedSplitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoesNotNeedSplitting: Self = this.set("doesNotNeedSplitting", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaSourceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: StringDictionary[js.Any]): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
  }
}
