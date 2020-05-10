package typingsSlinky.lessMiddleware

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCacheFile extends js.Object {
  /**
    * Path to a JSON file that will be used to cache less data across server restarts.
    * This can greatly speed up initial load time after a server restart - if the less
    * files haven't changed and the css files still exist, specifying this option will
    * mean that the less files don't need to be recompiled after a server restart.
    */
  var cacheFile: js.UndefOr[String] = js.native
  /**
    * Show more verbose logging?
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Destination directory to output the compiled .css files.
    */
  var dest: js.UndefOr[String] = js.native
  /**
    * Always re-compile less files on each request.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * Only recompile once after each server restart.
    * Useful for reducing disk i/o on production.
    */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * Common root of the source and destination.
    * It is prepended to both the source and destination before being used.
    */
  var pathRoot: js.UndefOr[String] = js.native
  /**
    * Object containing functions relevant to preprocessing data.
    */
  var postprocess: js.UndefOr[AnonCss] = js.native
  /**
    * Object containing functions relevant to preprocessing data.
    */
  var preprocess: js.UndefOr[AnonImportPaths] = js.native
  /**
    * Options for the less render.
    */
  var render: js.UndefOr[AnonCompress] = js.native
  /**
    * Function that is in charge of storing the css in the filesystem.
    */
  var storeCss: js.UndefOr[
    js.Function4[
      /* pathname */ String, 
      /* css */ String, 
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* next */ js.Function, 
      Unit
    ]
  ] = js.native
}

object AnonCacheFile {
  @scala.inline
  def apply(): AnonCacheFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCacheFile]
  }
  @scala.inline
  implicit class AnonCacheFileOps[Self <: AnonCacheFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheFile")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(js.undefined)
        ret
    }
    @scala.inline
    def withForce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("force")(js.undefined)
        ret
    }
    @scala.inline
    def withOnce(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(js.undefined)
        ret
    }
    @scala.inline
    def withPathRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withPostprocess(value: AnonCss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocess(value: AnonImportPaths): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: AnonCompress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withStoreCss(
      value: (/* pathname */ String, /* css */ String, /* req */ Request_[ParamsDictionary, _, _, Query], /* next */ js.Function) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeCss")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutStoreCss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeCss")(js.undefined)
        ret
    }
  }
  
}

