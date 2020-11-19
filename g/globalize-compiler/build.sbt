organization := "org.scalablytyped.slinky"
name := "globalize-compiler"
version := "v0.2.0-dt-20200527Z-7d4d4d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "cldrjs" % "0.4.4-dt-20200515Z-3efa4f",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20200623Z-5f5d40",
  "org.scalablytyped.slinky" %%% "globalize" % "1.5-dt-20200527Z-c1ec7b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
