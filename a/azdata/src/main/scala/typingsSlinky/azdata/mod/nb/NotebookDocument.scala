package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookDocument extends StObject {
  
  /**
    * All cells.
    */
  val cells: js.Array[NotebookCell] = js.native
  
  /**
    * The file system path of the associated resource. Shorthand
    * notation for [TextDocument.uri.fsPath](#TextDocument.uri). Independent of the uri scheme.
    */
  val fileName: String = js.native
  
  /**
    * `true` if the document have been closed. A closed document isn't synchronized anymore
    * and won't be re-used when the same resource is opened again.
    */
  val isClosed: Boolean = js.native
  
  /**
    * `true` if there are unpersisted changes.
    */
  val isDirty: Boolean = js.native
  
  /**
    * Is this document representing an untitled file which has never been saved yet. *Note* that
    * this does not mean the document will be saved to disk, use [`uri.scheme`](#Uri.scheme)
    * to figure out where a document will be [saved](#FileSystemProvider), e.g. `file`, `ftp` etc.
    */
  val isUntitled: Boolean = js.native
  
  /**
    * The spec for current kernel, if applicable. This will be undefined
    * until a kernel has been started
    */
  val kernelSpec: IKernelSpec = js.native
  
  /**
    * The identifier of the Notebook provider associated with this document.
    */
  val providerId: String = js.native
  
  /**
    * Save the underlying file.
    *
    * @return A promise that will resolve to true when the file
    * has been saved. If the file was not dirty or the save failed,
    * will return false.
    */
  def save(): Thenable[Boolean] = js.native
  
  /**
    * The associated uri for this notebook document.
    *
    * *Note* that most documents use the `file`-scheme, which means they are files on disk. However, **not** all documents are
    * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
    *
    */
  val uri: Uri = js.native
  
  /**
    * Ensure a cell range is completely contained in this document.
    *
    * @param range A cell range.
    * @return The given range or a new, adjusted range.
    */
  def validateCellRange(range: CellRange): CellRange = js.native
}
object NotebookDocument {
  
  @scala.inline
  def apply(
    cells: js.Array[NotebookCell],
    fileName: String,
    isClosed: Boolean,
    isDirty: Boolean,
    isUntitled: Boolean,
    kernelSpec: IKernelSpec,
    providerId: String,
    save: () => Thenable[Boolean],
    uri: Uri,
    validateCellRange: CellRange => CellRange
  ): NotebookDocument = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isUntitled = isUntitled.asInstanceOf[js.Any], kernelSpec = kernelSpec.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], save = js.Any.fromFunction0(save), uri = uri.asInstanceOf[js.Any], validateCellRange = js.Any.fromFunction1(validateCellRange))
    __obj.asInstanceOf[NotebookDocument]
  }
  
  @scala.inline
  implicit class NotebookDocumentMutableBuilder[Self <: NotebookDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[NotebookCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: NotebookCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClosed(value: Boolean): Self = StObject.set(x, "isClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUntitled(value: Boolean): Self = StObject.set(x, "isUntitled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelSpec(value: IKernelSpec): Self = StObject.set(x, "kernelSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: () => Thenable[Boolean]): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateCellRange(value: CellRange => CellRange): Self = StObject.set(x, "validateCellRange", js.Any.fromFunction1(value))
  }
}
