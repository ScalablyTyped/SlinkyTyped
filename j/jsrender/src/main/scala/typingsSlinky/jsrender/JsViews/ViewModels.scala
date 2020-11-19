package typingsSlinky.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModels extends Hash[ViewModel] {
  
  def apply(namedItems: Hash[ViewModelOptions]): Hash[ViewModel] = js.native
  def apply(namedItems: Hash[ViewModelOptions], viewModels: Hash[ViewModel]): Hash[ViewModel] = js.native
  def apply(name: String, viewModel: ViewModelOptions): ViewModel = js.native
  def apply(name: String, viewModel: ViewModelOptions, viewModels: Hash[ViewModel]): ViewModel = js.native
  /* $.views.viewModels() */
  def apply(viewModel: ViewModelOptions): ViewModel = js.native
}
