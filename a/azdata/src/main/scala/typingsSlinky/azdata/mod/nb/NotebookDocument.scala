package typingsSlinky.azdata.mod.nb

import typingsSlinky.vscode.Thenable
import typingsSlinky.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookDocument extends js.Object {
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
  			 * The associated uri for this notebook document.
  			 *
  			 * *Note* that most documents use the `file`-scheme, which means they are files on disk. However, **not** all documents are
  			 * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
  			 *
  			 */
  val uri: Uri = js.native
  /**
  			 * Save the underlying file.
  			 *
  			 * @return A promise that will resolve to true when the file
  			 * has been saved. If the file was not dirty or the save failed,
  			 * will return false.
  			 */
  def save(): Thenable[Boolean] = js.native
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
  implicit class NotebookDocumentOps[Self <: NotebookDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCells(value: js.Array[NotebookCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUntitled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUntitled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelSpec(value: IKernelSpec): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: () => Thenable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateCellRange(value: CellRange => CellRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateCellRange")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

