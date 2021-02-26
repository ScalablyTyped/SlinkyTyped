package typingsSlinky.fastGlob

import typingsSlinky.fastGlob.typesMod.EntryFilterFunction
import typingsSlinky.fastGlob.typesMod.MicromatchOptions
import typingsSlinky.fastGlob.typesMod.Pattern
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entryMod {
  
  @JSImport("fast-glob/out/providers/filters/entry", JSImport.Default)
  @js.native
  class default protected () extends EntryFilter {
    def this(_settings: typingsSlinky.fastGlob.settingsMod.default, _micromatchOptions: MicromatchOptions) = this()
  }
  
  @js.native
  trait EntryFilter extends StObject {
    
    var _createIndexRecord: js.Any = js.native
    
    var _filter: js.Any = js.native
    
    var _isDuplicateEntry: js.Any = js.native
    
    var _isMatchToPatterns: js.Any = js.native
    
    var _isSkippedByAbsoluteNegativePatterns: js.Any = js.native
    
    val _micromatchOptions: js.Any = js.native
    
    var _onlyDirectoryFilter: js.Any = js.native
    
    var _onlyFileFilter: js.Any = js.native
    
    val _settings: js.Any = js.native
    
    def getFilter(positive: js.Array[Pattern], negative: js.Array[Pattern]): EntryFilterFunction = js.native
    
    val index: Map[String, js.UndefOr[scala.Nothing]] = js.native
  }
  object EntryFilter {
    
    @scala.inline
    def apply(
      _createIndexRecord: js.Any,
      _filter: js.Any,
      _isDuplicateEntry: js.Any,
      _isMatchToPatterns: js.Any,
      _isSkippedByAbsoluteNegativePatterns: js.Any,
      _micromatchOptions: js.Any,
      _onlyDirectoryFilter: js.Any,
      _onlyFileFilter: js.Any,
      _settings: js.Any,
      getFilter: (js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction,
      index: Map[String, js.UndefOr[scala.Nothing]]
    ): EntryFilter = {
      val __obj = js.Dynamic.literal(_createIndexRecord = _createIndexRecord.asInstanceOf[js.Any], _filter = _filter.asInstanceOf[js.Any], _isDuplicateEntry = _isDuplicateEntry.asInstanceOf[js.Any], _isMatchToPatterns = _isMatchToPatterns.asInstanceOf[js.Any], _isSkippedByAbsoluteNegativePatterns = _isSkippedByAbsoluteNegativePatterns.asInstanceOf[js.Any], _micromatchOptions = _micromatchOptions.asInstanceOf[js.Any], _onlyDirectoryFilter = _onlyDirectoryFilter.asInstanceOf[js.Any], _onlyFileFilter = _onlyFileFilter.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = js.Any.fromFunction2(getFilter), index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryFilter]
    }
    
    @scala.inline
    implicit class EntryFilterMutableBuilder[Self <: EntryFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFilter(value: (js.Array[Pattern], js.Array[Pattern]) => EntryFilterFunction): Self = StObject.set(x, "getFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndex(value: Map[String, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_createIndexRecord(value: js.Any): Self = StObject.set(x, "_createIndexRecord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_filter(value: js.Any): Self = StObject.set(x, "_filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isDuplicateEntry(value: js.Any): Self = StObject.set(x, "_isDuplicateEntry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isMatchToPatterns(value: js.Any): Self = StObject.set(x, "_isMatchToPatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_isSkippedByAbsoluteNegativePatterns(value: js.Any): Self = StObject.set(x, "_isSkippedByAbsoluteNegativePatterns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_micromatchOptions(value: js.Any): Self = StObject.set(x, "_micromatchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onlyDirectoryFilter(value: js.Any): Self = StObject.set(x, "_onlyDirectoryFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onlyFileFilter(value: js.Any): Self = StObject.set(x, "_onlyFileFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
