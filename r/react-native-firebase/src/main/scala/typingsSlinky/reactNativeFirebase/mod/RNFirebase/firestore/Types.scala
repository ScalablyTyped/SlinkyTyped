package typingsSlinky.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`null`
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`object`
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.array
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.asc_
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.boolean
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cache
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.date
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.default
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.desc_
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.documentid
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.fieldvalue
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.geopoint
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.number
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.reference
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.server
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Types {
  
  @js.native
  trait GetOptions extends StObject {
    
    var source: default | server | cache = js.native
  }
  object GetOptions {
    
    @scala.inline
    def apply(source: default | server | cache): GetOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptions]
    }
    
    @scala.inline
    implicit class GetOptionsMutableBuilder[Self <: GetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: default | server | cache): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeDocumentChange extends StObject {
    
    var document: NativeDocumentSnapshot = js.native
    
    var newIndex: Double = js.native
    
    var oldIndex: Double = js.native
    
    var `type`: String = js.native
  }
  object NativeDocumentChange {
    
    @scala.inline
    def apply(document: NativeDocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: String): NativeDocumentChange = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeDocumentChange]
    }
    
    @scala.inline
    implicit class NativeDocumentChangeMutableBuilder[Self <: NativeDocumentChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument(value: NativeDocumentSnapshot): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NativeDocumentSnapshot extends StObject {
    
    var data: StringDictionary[TypeMap] = js.native
    
    var metadata: SnapshotMetadata = js.native
    
    var path: String = js.native
  }
  object NativeDocumentSnapshot {
    
    @scala.inline
    def apply(data: StringDictionary[TypeMap], metadata: SnapshotMetadata, path: String): NativeDocumentSnapshot = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeDocumentSnapshot]
    }
    
    @scala.inline
    implicit class NativeDocumentSnapshotMutableBuilder[Self <: NativeDocumentSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[TypeMap]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: SnapshotMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.asc_
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ASC
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.desc_
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.DESC
  */
  trait QueryDirection extends StObject
  object QueryDirection {
    
    @scala.inline
    def ASC: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ASC = "ASC".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ASC]
    
    @scala.inline
    def DESC: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.DESC = "DESC".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.DESC]
    
    @scala.inline
    def asc: asc_ = "asc".asInstanceOf[asc_]
    
    @scala.inline
    def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains`
  */
  trait QueryOperator extends StObject
  object QueryOperator {
    
    @scala.inline
    def Equalssign: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign = "=".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign]
    
    @scala.inline
    def EqualssignEqualssign: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign = "==".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign]
    
    @scala.inline
    def Greaterthansign: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign = ">".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignEqualssign: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign]
    
    @scala.inline
    def Lessthansign: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign = "<".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign]
    
    @scala.inline
    def LessthansignEqualssign: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign]
    
    @scala.inline
    def `array-contains`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains` = "array-contains".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains`]
  }
  
  @js.native
  trait SetOptions extends StObject {
    
    var merge: js.UndefOr[Boolean] = js.native
  }
  object SetOptions {
    
    @scala.inline
    def apply(): SetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions]
    }
    
    @scala.inline
    implicit class SetOptionsMutableBuilder[Self <: SetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    }
  }
  
  @js.native
  trait SnapshotMetadata extends StObject {
    
    var fromCache: Boolean = js.native
    
    var hasPendingWrites: Boolean = js.native
  }
  object SnapshotMetadata {
    
    @scala.inline
    def apply(fromCache: Boolean, hasPendingWrites: Boolean): SnapshotMetadata = {
      val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotMetadata]
    }
    
    @scala.inline
    implicit class SnapshotMetadataMutableBuilder[Self <: SnapshotMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasPendingWrites(value: Boolean): Self = StObject.set(x, "hasPendingWrites", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeMap extends StObject {
    
    var `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string = js.native
    
    var value: js.Any = js.native
  }
  object TypeMap {
    
    @scala.inline
    def apply(
      `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string,
      value: js.Any
    ): TypeMap = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeMap]
    }
    
    @scala.inline
    implicit class TypeMapMutableBuilder[Self <: TypeMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(
        value: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** The key in update() function for DocumentReference and WriteBatch. */
  type UpdateKey = String | FieldPath
}
