package typingsSlinky.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetServerSideProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typingsSlinky.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* context */ typingsSlinky.next.mod.GetServerSidePropsContext[Q], 
    js.Promise[typingsSlinky.next.anon.PropsP[P]]
  ]
  type GetStaticPaths[P /* <: typingsSlinky.node.querystringMod.ParsedUrlQuery */] = js.Function0[js.Promise[typingsSlinky.next.anon.Paths[P]]]
  type GetStaticProps[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */, Q /* <: typingsSlinky.node.querystringMod.ParsedUrlQuery */] = js.Function1[
    /* ctx */ typingsSlinky.next.mod.GetStaticPropsContext[Q], 
    js.Promise[typingsSlinky.next.anon.Props[P]]
  ]
  type NextPage[P, IP] = typingsSlinky.next.utilsMod.NextComponentType[typingsSlinky.next.utilsMod.NextPageContext, IP, P]
}
