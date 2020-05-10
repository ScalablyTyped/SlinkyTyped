package typingsSlinky.i18nextNodeFsBackend.i18nextNodeFsBackEnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Options for "i18next-node-fs-backend".
  * @interface
  */
@js.native
trait i18nextNodeFsBackEndOptions extends js.Object {
  /**
    * @summary Path to post missing resources
    * @type {string}
    */
  var addPath: String = js.native
  /**
    * @summary jsonIndent to use when storing json files
    * @type {number}
    */
  var jsonIndent: Double = js.native
  /**
    * @summary Path where resources get loaded from.
    * @type {string}
    */
  var loadPath: String = js.native
  /**
    * @summary custom parser
    * @type {function}
    */
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
}

object i18nextNodeFsBackEndOptions {
  @scala.inline
  def apply(addPath: String, jsonIndent: Double, loadPath: String): i18nextNodeFsBackEndOptions = {
    val __obj = js.Dynamic.literal(addPath = addPath.asInstanceOf[js.Any], jsonIndent = jsonIndent.asInstanceOf[js.Any], loadPath = loadPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nextNodeFsBackEndOptions]
  }
  @scala.inline
  implicit class i18nextNodeFsBackEndOptionsOps[Self <: i18nextNodeFsBackEndOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonIndent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
  }
  
}

