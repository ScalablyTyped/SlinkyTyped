package typingsSlinky.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectConditions extends js.Object {
  /**
    * `excludePrefixes` must follow the requirements described for
    * `includePrefixes`.
    *
    * The max size of `excludePrefixes` is 1000.
    */
  var excludePrefixes: js.UndefOr[js.Array[String]] = js.native
  /**
    * If `includePrefixes` is specified, objects that satisfy the object
    * conditions must have names that start with one of the `includePrefixes`
    * and that do not start with any of the `excludePrefixes`. If `includePrefixes`
    * is not specified, all objects except those that have names starting with
    * one of the `excludePrefixes` must satisfy the object conditions.
    *
    * Requirements:
    *
    * &#42; Each include-prefix and exclude-prefix can contain any sequence of
    * Unicode characters, of max length 1024 bytes when UTF8-encoded, and
    * must not contain Carriage Return or Line Feed characters.  Wildcard
    * matching and regular expression matching are not supported.
    *
    * &#42; Each include-prefix and exclude-prefix must omit the leading slash.
    * For example, to include the `requests.gz` object in a transfer from
    * `s3://my-aws-bucket/logs/y=2015/requests.gz`, specify the include
    * prefix as `logs/y=2015/requests.gz`.
    *
    * &#42; None of the include-prefix or the exclude-prefix values can be empty,
    * if specified.
    *
    * &#42; Each include-prefix must include a distinct portion of the object
    * namespace, i.e., no include-prefix may be a prefix of another
    * include-prefix.
    *
    * &#42; Each exclude-prefix must exclude a distinct portion of the object
    * namespace, i.e., no exclude-prefix may be a prefix of another
    * exclude-prefix.
    *
    * &#42; If `includePrefixes` is specified, then each exclude-prefix must start
    * with the value of a path explicitly included by `includePrefixes`.
    *
    * The max size of `includePrefixes` is 1000.
    */
  var includePrefixes: js.UndefOr[js.Array[String]] = js.native
  /**
    * `maxTimeElapsedSinceLastModification` is the complement to
    * `minTimeElapsedSinceLastModification`.
    */
  var maxTimeElapsedSinceLastModification: js.UndefOr[String] = js.native
  /**
    * If unspecified, `minTimeElapsedSinceLastModification` takes a zero value
    * and `maxTimeElapsedSinceLastModification` takes the maximum possible
    * value of Duration. Objects that satisfy the object conditions
    * must either have a `lastModificationTime` greater or equal to
    * `NOW` - `maxTimeElapsedSinceLastModification` and less than
    * `NOW` - `minTimeElapsedSinceLastModification`, or not have a
    * `lastModificationTime`.
    */
  var minTimeElapsedSinceLastModification: js.UndefOr[String] = js.native
}

object ObjectConditions {
  @scala.inline
  def apply(): ObjectConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectConditions]
  }
  @scala.inline
  implicit class ObjectConditionsOps[Self <: ObjectConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludePrefixes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludePrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePrefixes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includePrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTimeElapsedSinceLastModification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeElapsedSinceLastModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTimeElapsedSinceLastModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeElapsedSinceLastModification")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTimeElapsedSinceLastModification(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTimeElapsedSinceLastModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTimeElapsedSinceLastModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTimeElapsedSinceLastModification")(js.undefined)
        ret
    }
  }
  
}

