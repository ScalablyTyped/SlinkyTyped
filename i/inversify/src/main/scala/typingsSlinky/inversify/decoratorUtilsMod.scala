package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Metadata
import typingsSlinky.std.ClassDecorator
import typingsSlinky.std.MethodDecorator
import typingsSlinky.std.ParameterDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/annotation/decorator_utils", JSImport.Namespace)
@js.native
object decoratorUtilsMod extends js.Object {
  
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any): Unit = js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  def decorate(decorator: MethodDecorator | ParameterDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: String): Unit = js.native
  def decorate(decorator: ClassDecorator, target: js.Any, parameterIndex: Double): Unit = js.native
  
  def tagParameter(annotationTarget: js.Any, propertyName: String, parameterIndex: Double, metadata: Metadata): Unit = js.native
  
  def tagProperty(annotationTarget: js.Any, propertyName: String, metadata: Metadata): Unit = js.native
}
