package typingsSlinky.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCACHESDIRECTORYPATH extends js.Object {
  var CACHES_DIRECTORY_PATH: String = js.native
  var DOCUMENT_DIRECTORY_PATH: String = js.native
  var EXTERNAL_DIRECTORY_PATH: String = js.native
  var EXTERNAL_STORAGE_DIRECTORY_PATH: String = js.native
  var FILETYPE_DIRECTORY: String = js.native
  var FILETYPE_REGULAR: String = js.native
  var LIBRARY_DIRECTORY_PATH: String = js.native
  var MAIN_BUNDLE_PATH: String = js.native
  var TEMP_DIRECTORY_PATH: String = js.native
}

object AnonCACHESDIRECTORYPATH {
  @scala.inline
  def apply(
    CACHES_DIRECTORY_PATH: String,
    DOCUMENT_DIRECTORY_PATH: String,
    EXTERNAL_DIRECTORY_PATH: String,
    EXTERNAL_STORAGE_DIRECTORY_PATH: String,
    FILETYPE_DIRECTORY: String,
    FILETYPE_REGULAR: String,
    LIBRARY_DIRECTORY_PATH: String,
    MAIN_BUNDLE_PATH: String,
    TEMP_DIRECTORY_PATH: String
  ): AnonCACHESDIRECTORYPATH = {
    val __obj = js.Dynamic.literal(CACHES_DIRECTORY_PATH = CACHES_DIRECTORY_PATH.asInstanceOf[js.Any], DOCUMENT_DIRECTORY_PATH = DOCUMENT_DIRECTORY_PATH.asInstanceOf[js.Any], EXTERNAL_DIRECTORY_PATH = EXTERNAL_DIRECTORY_PATH.asInstanceOf[js.Any], EXTERNAL_STORAGE_DIRECTORY_PATH = EXTERNAL_STORAGE_DIRECTORY_PATH.asInstanceOf[js.Any], FILETYPE_DIRECTORY = FILETYPE_DIRECTORY.asInstanceOf[js.Any], FILETYPE_REGULAR = FILETYPE_REGULAR.asInstanceOf[js.Any], LIBRARY_DIRECTORY_PATH = LIBRARY_DIRECTORY_PATH.asInstanceOf[js.Any], MAIN_BUNDLE_PATH = MAIN_BUNDLE_PATH.asInstanceOf[js.Any], TEMP_DIRECTORY_PATH = TEMP_DIRECTORY_PATH.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCACHESDIRECTORYPATH]
  }
  @scala.inline
  implicit class AnonCACHESDIRECTORYPATHOps[Self <: AnonCACHESDIRECTORYPATH] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCACHES_DIRECTORY_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CACHES_DIRECTORY_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDOCUMENT_DIRECTORY_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DOCUMENT_DIRECTORY_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXTERNAL_DIRECTORY_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXTERNAL_DIRECTORY_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEXTERNAL_STORAGE_DIRECTORY_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EXTERNAL_STORAGE_DIRECTORY_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFILETYPE_DIRECTORY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FILETYPE_DIRECTORY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFILETYPE_REGULAR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FILETYPE_REGULAR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLIBRARY_DIRECTORY_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LIBRARY_DIRECTORY_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAIN_BUNDLE_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MAIN_BUNDLE_PATH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTEMP_DIRECTORY_PATH(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TEMP_DIRECTORY_PATH")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

