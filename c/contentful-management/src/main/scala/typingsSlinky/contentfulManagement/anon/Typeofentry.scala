package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.entryMod.Entry
import typingsSlinky.contentfulManagement.entryMod.EntryProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofentry extends StObject {
  
  def wrapEntry(http: AxiosInstance, data: EntryProp): Entry = js.native
  
  def wrapEntryCollection(http: AxiosInstance, data: CollectionProp[EntryProp]): Collection[Entry, EntryProp] = js.native
}
object Typeofentry {
  
  @scala.inline
  def apply(
    wrapEntry: (AxiosInstance, EntryProp) => Entry,
    wrapEntryCollection: (AxiosInstance, CollectionProp[EntryProp]) => Collection[Entry, EntryProp]
  ): Typeofentry = {
    val __obj = js.Dynamic.literal(wrapEntry = js.Any.fromFunction2(wrapEntry), wrapEntryCollection = js.Any.fromFunction2(wrapEntryCollection))
    __obj.asInstanceOf[Typeofentry]
  }
  
  @scala.inline
  implicit class TypeofentryMutableBuilder[Self <: Typeofentry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapEntry(value: (AxiosInstance, EntryProp) => Entry): Self = StObject.set(x, "wrapEntry", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapEntryCollection(value: (AxiosInstance, CollectionProp[EntryProp]) => Collection[Entry, EntryProp]): Self = StObject.set(x, "wrapEntryCollection", js.Any.fromFunction2(value))
  }
}
