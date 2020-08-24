organization := "org.scalablytyped.slinky"
name := "rdfjs__fetch"
version := "2.0-dt-20200322Z-5572ef"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200724Z-df8c17",
  "org.scalablytyped.slinky" %%% "rdf-js" % "3.0-dt-20200710Z-e0963f",
  "org.scalablytyped.slinky" %%% "rdfjs__fetch-lite" % "2.0-dt-20200302Z-63863e",
  "org.scalablytyped.slinky" %%% "rdfjs__sink-map" % "1.0-dt-20200116Z-18fd5d",
  "org.scalablytyped.slinky" %%% "std" % "3.9-88d6d8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
