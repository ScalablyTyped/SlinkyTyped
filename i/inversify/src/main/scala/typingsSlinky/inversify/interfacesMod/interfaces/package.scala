package typingsSlinky.inversify.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaces {
  type AsyncContainerModuleCallBack = js.Function4[
    /* bind */ typingsSlinky.inversify.interfacesMod.interfaces.Bind, 
    /* unbind */ typingsSlinky.inversify.interfacesMod.interfaces.Unbind, 
    /* isBound */ typingsSlinky.inversify.interfacesMod.interfaces.IsBound, 
    /* rebind */ typingsSlinky.inversify.interfacesMod.interfaces.Rebind, 
    js.Promise[scala.Unit]
  ]
  type Bind = js.Function1[
    /* serviceIdentifier */ typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
    typingsSlinky.inversify.interfacesMod.interfaces.BindingToSyntax[js.Any]
  ]
  type ContainerModuleCallBack = js.Function4[
    /* bind */ typingsSlinky.inversify.interfacesMod.interfaces.Bind, 
    /* unbind */ typingsSlinky.inversify.interfacesMod.interfaces.Unbind, 
    /* isBound */ typingsSlinky.inversify.interfacesMod.interfaces.IsBound, 
    /* rebind */ typingsSlinky.inversify.interfacesMod.interfaces.Rebind, 
    scala.Unit
  ]
  type ContextInterceptor = js.Function1[
    /* context */ typingsSlinky.inversify.interfacesMod.interfaces.Context, 
    typingsSlinky.inversify.interfacesMod.interfaces.Context
  ]
  type Factory[T] = js.Function1[/* repeated */ js.Any, (js.Function1[/* repeated */ js.Any, T]) | T]
  type FactoryCreator[T] = js.Function1[
    /* context */ typingsSlinky.inversify.interfacesMod.interfaces.Context, 
    typingsSlinky.inversify.interfacesMod.interfaces.Factory[T]
  ]
  type IsBound = js.Function1[
    /* serviceIdentifier */ typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
    scala.Boolean
  ]
  type MetadataMap = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.inversify.interfacesMod.interfaces.Metadata]]
  type Middleware = js.Function1[
    /* next */ typingsSlinky.inversify.interfacesMod.interfaces.Next, 
    typingsSlinky.inversify.interfacesMod.interfaces.Next
  ]
  type Next = js.Function1[
    /* args */ typingsSlinky.inversify.interfacesMod.interfaces.NextArgs, 
    js.Any | js.Array[js.Any]
  ]
  type Provider[T] = js.Function1[
    /* repeated */ js.Any, 
    (js.Function1[/* repeated */ js.Any, js.Promise[T]]) | js.Promise[T]
  ]
  type ProviderCreator[T] = js.Function1[
    /* context */ typingsSlinky.inversify.interfacesMod.interfaces.Context, 
    typingsSlinky.inversify.interfacesMod.interfaces.Provider[T]
  ]
  type Rebind = js.Function1[
    /* serviceIdentifier */ typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
    typingsSlinky.inversify.interfacesMod.interfaces.BindingToSyntax[js.Any]
  ]
  type ReflectResult = org.scalablytyped.runtime.StringDictionary[js.Array[typingsSlinky.inversify.interfacesMod.interfaces.Metadata]]
  type ResolveRequestHandler = js.Function1[/* request */ typingsSlinky.inversify.interfacesMod.interfaces.Request, js.Any]
  type Unbind = js.Function1[
    /* serviceIdentifier */ typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any], 
    scala.Unit
  ]
}
