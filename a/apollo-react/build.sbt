organization := "org.scalablytyped.slinky"
name := "apollo-react"
version := "0.7.1-5af265"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.4-ad259b",
  "org.scalablytyped.slinky" %%% "apollo-client" % "2.6.8-1cf68d",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-364afd",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.2-a32233",
  "org.scalablytyped.slinky" %%% "csstype" % "2.6.6-89abae",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-1eff51",
  "org.scalablytyped.slinky" %%% "prop-types" % "15.7-dt-20190924Z-6bb503",
  "org.scalablytyped.slinky" %%% "react" % "16.9-dt-20200227Z-f18fda",
  "org.scalablytyped.slinky" %%% "redux" % "4.0.5-9d78fe",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "typed-graphql" % "1.0.2-ebd20b",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20200225Z-1c8a0b",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-69885a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
