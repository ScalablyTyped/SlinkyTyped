package typingsSlinky.reactRelay.entryPointTypesMod

import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.reactRelay.reactRelayStrings.entryPoints
import typingsSlinky.reactRelay.reactRelayStrings.extraProps
import typingsSlinky.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints  :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>,   extraProps  :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>, getComponent (): TEntryPointComponent,   queries  :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>}> */
@js.native
trait PreloadedEntryPoint[TEntryPointComponent] extends js.Object {
  val entryPoints: LibraryManagedAttributes[TEntryPointComponent, typingsSlinky.reactRelay.reactRelayStrings.entryPoints] = js.native
  val extraProps: LibraryManagedAttributes[TEntryPointComponent, typingsSlinky.reactRelay.reactRelayStrings.extraProps] = js.native
  val getComponent: js.Function0[TEntryPointComponent] = js.native
  val queries: LibraryManagedAttributes[TEntryPointComponent, typingsSlinky.reactRelay.reactRelayStrings.queries] = js.native
}

object PreloadedEntryPoint {
  @scala.inline
  def apply[TEntryPointComponent](
    entryPoints: LibraryManagedAttributes[TEntryPointComponent, entryPoints],
    extraProps: LibraryManagedAttributes[TEntryPointComponent, extraProps],
    getComponent: () => TEntryPointComponent,
    queries: LibraryManagedAttributes[TEntryPointComponent, queries]
  ): PreloadedEntryPoint[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], getComponent = js.Any.fromFunction0(getComponent), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadedEntryPoint[TEntryPointComponent]]
  }
  @scala.inline
  implicit class PreloadedEntryPointOps[Self[tentrypointcomponent] <: PreloadedEntryPoint[tentrypointcomponent], TEntryPointComponent] (val x: Self[TEntryPointComponent]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEntryPointComponent] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEntryPointComponent]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEntryPointComponent] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEntryPointComponent] with Other]
    @scala.inline
    def withEntryPoints(value: LibraryManagedAttributes[TEntryPointComponent, entryPoints]): Self[TEntryPointComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraProps(value: LibraryManagedAttributes[TEntryPointComponent, extraProps]): Self[TEntryPointComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetComponent(value: () => TEntryPointComponent): Self[TEntryPointComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueries(value: LibraryManagedAttributes[TEntryPointComponent, queries]): Self[TEntryPointComponent] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

