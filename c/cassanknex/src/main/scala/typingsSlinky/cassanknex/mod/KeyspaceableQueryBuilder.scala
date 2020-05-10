package typingsSlinky.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyspaceableQueryBuilder extends js.Object {
  def withDurableWrites(durableWrites: Boolean): this.type = js.native
  def withNetworkTopologyStrategy(strategy: MappedDict[Double]): this.type = js.native
  def withSimpleStrategy(replicas: Double): this.type = js.native
}

object KeyspaceableQueryBuilder {
  @scala.inline
  def apply(
    withDurableWrites: Boolean => KeyspaceableQueryBuilder,
    withNetworkTopologyStrategy: MappedDict[Double] => KeyspaceableQueryBuilder,
    withSimpleStrategy: Double => KeyspaceableQueryBuilder
  ): KeyspaceableQueryBuilder = {
    val __obj = js.Dynamic.literal(withDurableWrites = js.Any.fromFunction1(withDurableWrites), withNetworkTopologyStrategy = js.Any.fromFunction1(withNetworkTopologyStrategy), withSimpleStrategy = js.Any.fromFunction1(withSimpleStrategy))
    __obj.asInstanceOf[KeyspaceableQueryBuilder]
  }
  @scala.inline
  implicit class KeyspaceableQueryBuilderOps[Self <: KeyspaceableQueryBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithDurableWrites(value: Boolean => KeyspaceableQueryBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withDurableWrites")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithNetworkTopologyStrategy(value: MappedDict[Double] => KeyspaceableQueryBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withNetworkTopologyStrategy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithSimpleStrategy(value: Double => KeyspaceableQueryBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withSimpleStrategy")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

