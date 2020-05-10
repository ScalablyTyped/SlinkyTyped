package typingsSlinky.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mapping[Source, Target] extends js.Object {
  /**
    * The array of results. These results will be synchronized with the latest array of sources that were provided using [[map]].
    */
  var results: js.Array[Target] = js.native
  /**
    * Maps a new array of sources and updates [[results]].
    *
    * @param newSources   The new array of sources.
    */
  def map(newSources: js.Array[Source]): Unit = js.native
}

object Mapping {
  @scala.inline
  def apply[Source, Target](map: js.Array[Source] => Unit, results: js.Array[Target]): Mapping[Source, Target] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping[Source, Target]]
  }
  @scala.inline
  implicit class MappingOps[Self[source, target] <: Mapping[source, target], Source, Target] (val x: Self[Source, Target]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Source, Target] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Source, Target]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Source, Target]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Source, Target]) with Other]
    @scala.inline
    def withMap(value: js.Array[Source] => Unit): Self[Source, Target] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResults(value: js.Array[Target]): Self[Source, Target] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

