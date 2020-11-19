package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetServerSideProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typingsSlinky.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* context */ typingsSlinky.next.mod.GetServerSidePropsContext[Q], 
    js.Promise[typingsSlinky.next.mod.GetServerSidePropsResult[P]]
  ]
  
  type GetStaticPaths[P /* <: typingsSlinky.node.querystringMod.ParsedUrlQuery */] = js.Function0[js.Promise[typingsSlinky.next.anon.Fallback[P]]]
  
  type GetStaticProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typingsSlinky.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* context */ typingsSlinky.next.mod.GetStaticPropsContext[Q], 
    js.Promise[typingsSlinky.next.mod.GetStaticPropsResult[P]]
  ]
  
  type InferGetServerSidePropsType[T] = js.Any
  
  type InferGetStaticPropsType[T] = js.Any
  
  type NextPage[P, IP] = typingsSlinky.next.utilsMod.NextComponentType[typingsSlinky.next.utilsMod.NextPageContext, IP, P]
}
