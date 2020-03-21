organization := "org.scalablytyped.slinky"
name := "apollo-client"
version := "2.6.8-1cf68d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.4",
  "org.scalablytyped.slinky" %%% "apollo-cache" % "1.3.4-ad259b",
  "org.scalablytyped.slinky" %%% "apollo-link" % "1.2.13-364afd",
  "org.scalablytyped.slinky" %%% "apollo-utilities" % "1.3.2-a32233",
  "org.scalablytyped.slinky" %%% "graphql" % "14.6.0-1eff51",
  "org.scalablytyped.slinky" %%% "std" % "3.8-16327f",
  "org.scalablytyped.slinky" %%% "zen-observable" % "0.8-dt-20200225Z-1c8a0b",
  "org.scalablytyped.slinky" %%% "zen-observable-ts" % "0.8.20-69885a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
