package typingsSlinky.inert.mod.hapiAugmentingMod

import typingsSlinky.hapi.mod.Request
import typingsSlinky.inert.anon.RelativeTo
import typingsSlinky.inert.mod.DirectoryHandlerRouteObject
import typingsSlinky.inert.mod.FileHandlerRouteObject
import typingsSlinky.inert.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerDecorations extends js.Object {
  /**
    * The directory handler
    *
    * Generates a directory endpoint for serving static content from a directory.
    * Routes using the directory handler must include a path parameter at the end of the path string
    * (e.g. /path/to/somewhere/{param} where the parameter name does not matter).
    * The path parameter can use any of the parameter options (e.g. {param} for one level files only,
    * {param?} for one level files or the directory root, {param*} for any level, or {param*3} for a specific level).
    * If additional path parameters are present, they are ignored for the purpose of selecting the file system resource.
    * The directory handler is an object with the following options:
    * @see {@link https://github.com/hapijs/inert#the-directory-handler}
    */
  var directory: js.UndefOr[DirectoryHandlerRouteObject] = js.native
  /**
    * The file handler
    *
    * Generates a static file endpoint for serving a single file. file can be set to:
    *  * a relative or absolute file path string (relative paths are resolved based on the route files configuration).
    *  * a function with the signature function(request) which returns the relative or absolute file path.
    *  * an object with one or more of the following options @see IFileHandler
    * @see {@link https://github.com/hapijs/inert#the-file-handler}
    */
  var file: js.UndefOr[String | RequestHandler[String] | FileHandlerRouteObject] = js.native
  var files: js.UndefOr[RelativeTo] = js.native
}

object HandlerDecorations {
  @scala.inline
  def apply(): HandlerDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandlerDecorations]
  }
  @scala.inline
  implicit class HandlerDecorationsOps[Self <: HandlerDecorations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: DirectoryHandlerRouteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(js.undefined)
        ret
    }
    @scala.inline
    def withFileFunction1(value: /* request */ Request => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFile(value: String | RequestHandler[String] | FileHandlerRouteObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFiles(value: RelativeTo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
  }
  
}

