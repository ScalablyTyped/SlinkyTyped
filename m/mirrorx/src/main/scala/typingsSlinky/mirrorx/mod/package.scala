package typingsSlinky.mirrorx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typingsSlinky.std.Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  @scala.inline
  def actions: typingsSlinky.mirrorx.mod.Actions_ = typingsSlinky.mirrorx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("actions").asInstanceOf[typingsSlinky.mirrorx.mod.Actions_]
  
  @scala.inline
  def connect: typingsSlinky.reactRedux.mod.Connect_[typingsSlinky.reactRedux.mod.DefaultRootState] = typingsSlinky.mirrorx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("connect").asInstanceOf[typingsSlinky.reactRedux.mod.Connect_[typingsSlinky.reactRedux.mod.DefaultRootState]]
  
  @scala.inline
  def defaults(): js.Function1[/* options */ typingsSlinky.mirrorx.mod.defaultOptions, scala.Unit] = typingsSlinky.mirrorx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaults")().asInstanceOf[js.Function1[/* options */ typingsSlinky.mirrorx.mod.defaultOptions, scala.Unit]]
  
  @scala.inline
  def hook(): js.Function1[/* subscriber */ js.Function0[_], _] = typingsSlinky.mirrorx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hook")().asInstanceOf[js.Function1[/* subscriber */ js.Function0[_], _]]
  
  @scala.inline
  def render: typingsSlinky.mirrorx.mod.Renderer = typingsSlinky.mirrorx.mod.^.asInstanceOf[js.Dynamic].selectDynamic("render").asInstanceOf[typingsSlinky.mirrorx.mod.Renderer]
  
  @scala.inline
  def withRouter[P /* <: typingsSlinky.mirrorx.mod.RouteComponentProps[_] */](component: slinky.core.ReactComponentClass[P]): slinky.core.ReactComponentClass[
    typingsSlinky.mirrorx.mod.Omit[
      P, 
      /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ typingsSlinky.mirrorx.mirrorxStrings.`match` | typingsSlinky.mirrorx.mirrorxStrings.location | typingsSlinky.mirrorx.mirrorxStrings.history | typingsSlinky.mirrorx.mirrorxStrings.staticContext
    ]
  ] = typingsSlinky.mirrorx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(component.asInstanceOf[js.Any]).asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.mirrorx.mod.Omit[
      P, 
      /* keyof mirrorx.mirrorx.RouteComponentProps<any> */ typingsSlinky.mirrorx.mirrorxStrings.`match` | typingsSlinky.mirrorx.mirrorxStrings.location | typingsSlinky.mirrorx.mirrorxStrings.history | typingsSlinky.mirrorx.mirrorxStrings.staticContext
    ]
  ]]
  @scala.inline
  def withRouter[TFunction /* <: slinky.core.ReactComponentClass[_] */](target: TFunction): TFunction = typingsSlinky.mirrorx.mod.^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(target.asInstanceOf[js.Any]).asInstanceOf[TFunction]
}
