package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an implementation for embedded object persistence.
  *
  * The idea is that any usable embedded object should be initialized with an entry in the parent storage that will be used as persistent representation.
  */
@js.native
trait XEmbedPersist extends XCommonEmbedPersist {
  
  /**
    * allows to retrieve the current object entry name.
    * @returns the object entry name if any
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  val EntryName: String = js.native
  
  /**
    * allows to retrieve the current object entry name.
    * @returns the object entry name if any
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  def getEntryName(): String = js.native
  
  /**
    * allows to detect if the object has entry.
    * @returns `TRUE` if the object has own entry set `FALSE` otherwise
    */
  def hasEntry(): Boolean = js.native
  
  /**
    * specifies whether the object should use an old storage or a new one after "save as" operation.
    * @param bUseNew `TRUE` the new storage should be used `FALSE` the old one
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def saveCompleted(bUseNew: Boolean): Unit = js.native
  
  /**
    * provides object with a parent storage and a name for object's entry.
    *
    * An entry with the specified name should be created/opened inside provided storage. It can be a storage or a stream. For example, OOo API will refer to
    * OLE storages only by streams, but the object implementation will use storage based on this stream.
    *
    * Factory does this call to initialize the embedded object. The linked object can be initialized by factory in different way ( internally ).
    *
    * It is also possible to switch object persistent representation through this call. Actually this is the way, this call can be used by user ( since
    * initialization is done by factory ).
    * @param xStorage a parent storage the entry should be created in
    * @param sEntName a name for the entry
    * @param nEntryConnectionMode a mode in which the object should be initialized from entry can take values from {@link EntryInitModes} constant set
    * @param aMediaArgs optional parameters for the embedded document persistence initialization, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object persistence initialization, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def setPersistentEntry(
    xStorage: XStorage,
    sEntName: String,
    nEntryConnectionMode: Double,
    aMediaArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): Unit = js.native
  
  /**
    * lets the object store itself to an entry in destination storage and prepare to use the new entry for own persistence.
    *
    * The object should be stored to the new entry, after that the entry should be remembered by the object. After the storing process is finished the
    * {@link XEmbedPersist.saveCompleted()} method can be used to specify whether the object should use the new entry or the old one. The object persistence
    * can not be used until {@link XEmbedPersist.saveCompleted()} is called. So this state can be treated as "HandsOff" state.
    * @param xStorage a parent storage the entry should be created in
    * @param sEntName a name for the entry
    * @param aMediaArgs optional parameters for document saving, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object saving, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during storing
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeAsEntry(
    xStorage: XStorage,
    sEntName: String,
    aMediaArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): Unit = js.native
  
  /**
    * lets the object store itself to an entry in destination storage, the own persistence entry is not changed.
    * @param xStorage a parent storage the entry should be created inside
    * @param sEntName a name for the entry
    * @param aMediaArgs optional parameters for document saving, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object saving, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during storing
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeToEntry(
    xStorage: XStorage,
    sEntName: String,
    aMediaArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): Unit = js.native
}
object XEmbedPersist {
  
  @scala.inline
  def apply(
    EntryName: String,
    acquire: () => Unit,
    getEntryName: () => String,
    hasEntry: () => Boolean,
    isReadonly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    saveCompleted: Boolean => Unit,
    setPersistentEntry: (XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    storeAsEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit,
    storeOwn: () => Unit,
    storeToEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit
  ): XEmbedPersist = {
    val __obj = js.Dynamic.literal(EntryName = EntryName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEntryName = js.Any.fromFunction0(getEntryName), hasEntry = js.Any.fromFunction0(hasEntry), isReadonly = js.Any.fromFunction0(isReadonly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reload = js.Any.fromFunction2(reload), saveCompleted = js.Any.fromFunction1(saveCompleted), setPersistentEntry = js.Any.fromFunction5(setPersistentEntry), storeAsEntry = js.Any.fromFunction4(storeAsEntry), storeOwn = js.Any.fromFunction0(storeOwn), storeToEntry = js.Any.fromFunction4(storeToEntry))
    __obj.asInstanceOf[XEmbedPersist]
  }
  
  @scala.inline
  implicit class XEmbedPersistOps[Self <: XEmbedPersist] (val x: Self) extends AnyVal {
    
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
    def setEntryName(value: String): Self = this.set("EntryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEntryName(value: () => String): Self = this.set("getEntryName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasEntry(value: () => Boolean): Self = this.set("hasEntry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSaveCompleted(value: Boolean => Unit): Self = this.set("saveCompleted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPersistentEntry(value: (XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit): Self = this.set("setPersistentEntry", js.Any.fromFunction5(value))
    
    @scala.inline
    def setStoreAsEntry(value: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit): Self = this.set("storeAsEntry", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStoreToEntry(value: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Unit): Self = this.set("storeToEntry", js.Any.fromFunction4(value))
  }
}
