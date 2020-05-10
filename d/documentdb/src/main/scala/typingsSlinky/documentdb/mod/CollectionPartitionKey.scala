package typingsSlinky.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionPartitionKey extends js.Object {
  /**
    * The algorithm used for partitioning. Only Hash is supported.
    */
  var kind: PartitionKind = js.native
  /**
    * An array of paths using which data within the collection can be partitioned.
    *
    * Paths must not contain a wildcard or a trailing slash. For example, the JSON property “AccountNumber” is specified as “/AccountNumber”.
    *
    * The array must contain only a single value.
    */
  var paths: js.Array[String] = js.native
}

object CollectionPartitionKey {
  @scala.inline
  def apply(kind: PartitionKind, paths: js.Array[String]): CollectionPartitionKey = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionPartitionKey]
  }
  @scala.inline
  implicit class CollectionPartitionKeyOps[Self <: CollectionPartitionKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: PartitionKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

